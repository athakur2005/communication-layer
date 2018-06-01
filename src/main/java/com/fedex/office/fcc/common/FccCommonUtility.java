/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

/**
 * @author Anil.Thakur
 */
public class FccCommonUtility implements FccCommonConstantsIfc
{
    // private static Properties properties = null;
    private static FccJaxbTranslator translator = null;
    private static FccXmlFormatter formatter = null;
    final static Logger logger = Logger.getLogger(FccCommonUtility.class);

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccSaleResponse sendSaleRequestAndWaitForResponse(FccSaleRequest request)
            throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendSaleRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid sale request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            properties.put(POS_TIME_OUT, getNonNullString(request.getPosTimeout()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.SaleResp.name());
                if (response != null && response instanceof FccSaleResponse)
                {
                    return (FccSaleResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendSaleRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccRefundResponse sendRefundRequestAndWaitForResponse(FccRefundRequest request)
            throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendRefundRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid refund request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            properties.put(POS_TIME_OUT, getNonNullString(request.getPosTimeout()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.RefundResp.name());
                if (response != null && response instanceof FccRefundResponse)
                {
                    return (FccRefundResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendRefundRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccVoidResponse sendVoidRequestAndWaitForResponse(FccVoidRequest request)
            throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendVoidRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid void request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            properties.put(POS_TIME_OUT, getNonNullString(request.getPosTimeout()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.VoidResp.name());
                if (response != null && response instanceof FccVoidResponse)
                {
                    return (FccVoidResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendVoidRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccCardReadResponse sendCardReadRequestAndWaitForResponse(
            FccCardReadRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendCardReadRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid card read request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.CardReadResp.name());
                if (response != null && response instanceof FccCardReadResponse)
                {
                    return (FccCardReadResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendCardReadRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccSignatureResponse sendSignatureRequestAndWaitForResponse(
            FccSignatureRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendSignatureRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid signature request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.SignatureResp.name());
                if (response != null && response instanceof FccSignatureResponse)
                {
                    return (FccSignatureResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendSignatureRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccCancelResponse sendCancelRequestAndWaitForResponse(FccCancelRequest request)
            throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendCancelRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid cancel request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.CancelResp.name());
                if (response != null && response instanceof FccCancelResponse)
                {
                    return (FccCancelResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendCancelRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccReplayStatusResponse sendReplayStatusRequestAndWaitForResponse(
            FccReplayStatusRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendReplayStatusRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid replay status request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(request, true, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.GetReplayStatusResp.name());
                if (response != null && response instanceof FccReplayStatusResponse)
                {
                    logger.debug(
                            "Exiting method FccCommonUtility.sendReplayStatusRequestAndWaitForResponse()");
                    return (FccReplayStatusResponse) response;
                }
            }
        }
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccBeginTransactionResponse sendBeginTransactionRequestAndWaitForResponse(
            FccBeginTransactionRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendBeginTransactionRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid begin transaction request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccBeginTransactionRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.BeginTransResp.name());
                if (response != null && response instanceof FccBeginTransactionResponse)
                {
                    return (FccBeginTransactionResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendBeginTransactionRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccBeginReadResponse sendBeginReadRequestAndWaitForResponse(
            FccBeginReadRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendBeginReadRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid begin read request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccBeginReadRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.BeginReadResp.name());
                if (response != null && response instanceof FccBeginReadResponse)
                {
                    return (FccBeginReadResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendBeginReadRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccBeginPaymentResponse sendBeginPaymentRequestAndWaitForResponse(
            FccBeginPaymentRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendBeginPaymentRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid begin payment request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccBeginPaymentRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.BeginPaymentResp.name());
                if (response != null && response instanceof FccBeginPaymentResponse)
                {
                    return (FccBeginPaymentResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendBeginPaymentRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccEndPaymentResponse sendEndPaymentRequestAndWaitForResponse(
            FccEndPaymentRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendEndPaymentRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid replay status request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccEndPaymentRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.EndPaymentResp.name());
                if (response != null && response instanceof FccEndPaymentResponse)
                {
                    return (FccEndPaymentResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendEndPaymentRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccAbortFlowResponse sendAbortFlowRequestAndWaitForResponse(
            FccAbortFlowRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendAbortFlowRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid abort flow request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccAbortFlowRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.AbortFlowResp.name());
                if (response != null && response instanceof FccAbortFlowResponse)
                {
                    return (FccAbortFlowResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendAbortFlowRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccEndTransactionResponse sendEndTransactionRequestAndWaitForResponse(
            FccEndTransactionRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendEndTransactionRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid end transaction request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccEndTransactionRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.EndTransactionResp.name());
                if (response != null && response instanceof FccEndTransactionResponse)
                {
                    return (FccEndTransactionResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendBeginTransactionRequestAndWaitForResponse()");
        return null;
    }

    public static FccUpdateDisplayResponse sendUpdateDisplayRequestAndWaitForResponse(
            FccUpdateDisplayRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendUpdateDisplayRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid update display request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccUpdateDisplayRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.UpdateDisplayResp.name());
                if (response != null && response instanceof FccUpdateDisplayResponse)
                {
                    return (FccUpdateDisplayResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendUpdateDisplayRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccSignatureCaptureResponse sendSignatureCaptureRequestAndWaitForResponse(
            FccSignatureCaptureRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendSignatureCaptureRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid signature capture request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccSignatureCaptureRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.SignatureCaptureResp.name());
                if (response != null && response instanceof FccSignatureCaptureResponse)
                {
                    return (FccSignatureCaptureResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendSignatureCaptureRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccWaitEventResponse sendWaitEventRequestAndWaitForResponse(
            FccWaitEventRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendWaitEventRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid wait event request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            properties.put(POS_TIME_OUT,getNonNullString(request.getPosTimeout()));         
            String responseXML = getResponseFromFCC(convertToFccWaitEventRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.WaitEventResp.name());
                if (response != null && response instanceof FccWaitEventResponse)
                {
                    // simulateResponses((FccWaitEventResponse) response);
                    return (FccWaitEventResponse) response;
                }
            }
        }
        logger.debug("Exiting method FccCommonUtility.sendWaitEventRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccCompleteReferralResponse sendCompleteReferralRequestAndWaitForResponse(
            FccCompleteReferralRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendCompleteReferralRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid complete referral request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccCompleteReferralRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.CompleteReferralResp.name());
                if (response != null && response instanceof FccCompleteReferralResponse)
                {
                    return (FccCompleteReferralResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendCompleteReferralRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccCompleteSignatureResponse sendCompleteSignatureRequestAndWaitForResponse(
            FccCompleteSignatureRequest request) throws IOException, JAXBException
    {
        logger.debug(
                "Entering method FccCommonUtility.sendCompleteSignatureRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid complete signature request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccCompleteSignatureRequest(request),
                    false, properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.CompleteSignatureResp.name());
                if (response != null && response instanceof FccCompleteSignatureResponse)
                {
                    return (FccCompleteSignatureResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendCompleteSignatureRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public static FccFormEntryResponse sendFormEntryRequestAndWaitForResponse(
            FccFormEntryRequest request) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.sendFormEntryRequestAndWaitForResponse()");
        if (request == null)
        {
            logger.debug("Please send valid form entry request.");
        }
        else
        {
            Properties properties = new Properties();
            properties.put(FCC_PROXY_SERVER_ADDRESS,
                    getNonNullString(request.getFccProxyServerAddress()));
            properties.put(FCC_PROXY_SERVER_PORT,
                    getNonNullString(request.getFccProxyServerPort()));
            properties.put(FCC_CLIENT_ADDRESS, getNonNullString(request.getFccClientAddress()));
            properties.put(FCC_CLIENT_PORT, getNonNullString(request.getFccClientPort()));
            properties.put(FCC_SERVER_ADDRESS, getNonNullString(request.getFccServerAddress()));
            properties.put(FCC_SERVER_PORT, getNonNullString(request.getFccServerPort()));
            String responseXML = getResponseFromFCC(convertToFccFormEntryRequest(request), false,
                    properties);
            if (responseXML != null)
            {
                Object response = getJaxbTranslator().toResponseObject(responseXML,
                        FCCResponseTypeEnum.FormEntryResp.name());
                if (response != null && response instanceof FccFormEntryResponse)
                {
                    return (FccFormEntryResponse) response;
                }
            }
        }
        logger.debug(
                "Exiting method FccCommonUtility.sendBeginTransactionRequestAndWaitForResponse()");
        return null;
    }

    /**
     * @return
     */
    public static HttpURLConnection getLegacyConnection(Properties properties)
    {
        // loadProperties();
        logger.debug("Entering method FccCommonUtility.getLegacyConnection()");
        HttpURLConnection con = null;
        try
        {
            URI uri = new URI(HTTP_PROTOCOL, null, properties.getProperty(FCC_SERVER_ADDRESS),
                    Integer.parseInt(properties.getProperty(FCC_SERVER_PORT)), null, null, null);
            con = (HttpURLConnection) uri.toURL().openConnection();
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "application/xml");
            if (isNotNullAndIsNotEmpty(properties.getProperty(POS_TIME_OUT)))
            {
                con.setReadTimeout(Integer.parseInt(properties.getProperty(POS_TIME_OUT)));
            }
            logger.debug("Exiting method FccCommonUtility.getLegacyConnection()");
            return con;
        }
        catch (MalformedURLException mue)
        {
            logger.error("MalformedURLException in method FccCommonUtility.getLegacyConnection()"
                    + mue.getMessage());
        }
        catch (IOException ioe)
        {
            logger.error("IOException in method FccCommonUtility.getLegacyConnection()"
                    + ioe.getMessage());
        }
        catch (URISyntaxException urise)
        {
            logger.error("IOURISyntaxException in method FccCommonUtility.getLegacyConnection()"
                    + urise.getMessage());
        }
        return null;
    }

    /**
     * @param connection
     */
    public static void closeConnection(HttpURLConnection connection)
    {
        if (connection != null)
        {
            connection.disconnect();
            connection = null;
        }
    }

    /**
     * @return
     */
    public static HttpURLConnection getConnection(String poiCommand, Properties properties)
    {
        // loadProperties();
        logger.debug("Entering method FccCommonUtility.getConnection()");
        HttpURLConnection con = null;
        try
        {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,
                    new InetSocketAddress(properties.getProperty(FCC_PROXY_SERVER_ADDRESS),
                            Integer.parseInt(properties.getProperty(FCC_PROXY_SERVER_PORT))));
            URI uri = new URI(HTTP_PROTOCOL, null, properties.getProperty(FCC_CLIENT_ADDRESS),
                    Integer.parseInt(properties.getProperty(FCC_CLIENT_PORT)),
                    FCCPoiCommandEnum.valueOf(poiCommand).getPoiPath(), null, null);
            con = (HttpURLConnection) uri.toURL().openConnection(proxy);
            con.setRequestProperty("Content-Type", "application/xml");
            con.setDoOutput(true);
            con.setDoInput(true);
            if (isNotNullAndIsNotEmpty(properties.getProperty(POS_TIME_OUT)))
            {
                con.setReadTimeout(Integer.parseInt(properties.getProperty(POS_TIME_OUT)));
            }
            logger.debug("Exiting method FccCommonUtility.getConnection()");
            return con;
        }
        catch (MalformedURLException mue)
        {
            logger.error("MalformedURLException in method FccCommonUtility.getConnection()"
                    + mue.getMessage());
        }
        catch (IOException ioe)
        {
            logger.error(
                    "IOException in method FccCommonUtility.getConnection()" + ioe.getMessage());
        }
        catch (URISyntaxException urlse)
        {
            logger.error("URISyntaxException in method FccCommonUtility.getConnection()"
                    + urlse.getMessage());
        }
        return null;
    }

    /**
     * @param con
     * @return
     */
    public static String readFromFccStream(URLConnection con)
    {
        logger.debug("Entering method FccCommonUtility.readFromFccStream()");
        BufferedWriter writer = null;
        try
        {
            InputStreamReader inputStream = new InputStreamReader(con.getInputStream());
            StringBuilder buf = new StringBuilder();
            char[] cbuf = new char[8192];

            int num;
            while ((num = inputStream.read(cbuf)) != -1)
            {
                buf.append(cbuf, 0, num);
            }
            logger.debug("Exiting method FccCommonUtility.readFromFccStream()");
            return buf.toString();
        }
        catch (IOException ioe)
        {
            logger.error("IOException in method FccCommonUtility.readFromFccStream()"
                    + ioe.getMessage());
        }
        finally
        {
            try
            {
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException ioe)
            {
                logger.error("IOException in method FccCommonUtility.readFromFccStream()"
                        + ioe.getMessage());
            }

        }
        return null;
    }

    /**
     * @return
     */
    private static FccJaxbTranslator getJaxbTranslator()
    {
        logger.debug("Entering method FccCommonUtility.getJaxbTranslator()");
        if (translator == null)
        {
            translator = new FccJaxbTranslator();
        }
        logger.debug("Exiting method FccCommonUtility.getJaxbTranslator()");
        return translator;
    }

    /**
     * @return
     */
    private static FccXmlFormatter getXmlFormatter()
    {
        logger.debug("Entering method FccCommonUtility.getXmlFormatter()");
        if (formatter == null)
        {
            formatter = new FccXmlFormatter();
        }
        logger.debug("Exiting method FccCommonUtility.getXmlFormatter()");
        return formatter;
    }

    /**
     * @param con
     * @param requestXML
     * @throws IOException
     */
    private static void writeToFccStream(URLConnection con, String requestXML) throws IOException
    {
        OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
        writer.write(requestXML);
        writer.flush();
        writer.close();
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    private static String getResponseFromFCC(FccNamed request, boolean isLegacyCall,
            Properties properties) throws IOException, JAXBException
    {
        logger.debug("Entering method FccCommonUtility.getResponseFromFCC()");
        String responseXML = null;
        if (request == null)
        {
            logger.debug(request + " is null, please recheck");
        }
        else
        {
            if (isLegacyCall)
            {
                responseXML = getLegacyResponseFromFCC(request, properties);
            }
            else
            {
                responseXML = getPoiResponseFromFCC(request, properties);
            }
        }
        logger.debug("Exiting method FccCommonUtility.getResponseFromFCC()");
        return responseXML;
    }

    /**
     * @param request
     * @param properties
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    private static String getLegacyResponseFromFCC(FccNamed request, Properties properties)
            throws IOException, JAXBException
    {
        HttpURLConnection connection = getLegacyConnection(properties);
        String responseXML = null;
        if (connection != null)
        {
            String requestXML = getJaxbTranslator().toRequestXml(request);
            writeToFccStream(connection, requestXML);
            // Before putting the log statement, mask the credit card number
            if (FCCRequestTypeEnum.Sale.name().equalsIgnoreCase(request.getName())
                    || FCCRequestTypeEnum.Refund.name().equalsIgnoreCase(request.getName()))
            {
                logger.info("Legacy request XML->"
                        + getXmlFormatter().format(getMaskedCardNumber(requestXML)));
            }
            else
            {
                logger.info("Legacy request XML->" + getXmlFormatter().format(requestXML));
            }
            responseXML = readFromFccStream(connection);
            if (responseXML != null)
            {
                logger.info("Legacy response XML->" + getXmlFormatter().format(responseXML));
            }
        }
        closeConnection(connection);
        return responseXML;
    }

    /**
     * @param request
     * @param properties
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    private static String getPoiResponseFromFCC(FccNamed request, Properties properties)
            throws IOException, JAXBException
    {

        HttpURLConnection connection = getConnection(request.getName(), properties);
        String responseXML = null;
        if (connection != null)
        {
            String requestXML = getJaxbTranslator().toRequestXml(request);
            writeToFccStream(connection, requestXML);
            logger.info("Poi request XML->" + getXmlFormatter().format(requestXML));
            responseXML = readFromFccStream(connection);
            if (responseXML != null)
            {
                logger.info("Poi response XML->" + getXmlFormatter().format(responseXML));
            }
        }
        closeConnection(connection);
        return responseXML;
    }

    /**
     * @param request
     * @return
     */
    private static FccXmlBeginTransactionRequest convertToFccBeginTransactionRequest(
            FccBeginTransactionRequest request)
    {
        FccXmlBeginTransactionRequest beginTransrequest = new FccXmlBeginTransactionRequest();
        beginTransrequest.setLaneId(request.getLaneId());
        FccDisplayDataParent parent = new FccDisplayDataParent();
        FccScrollingLineTextData scrollingLines = new FccScrollingLineTextData();
        scrollingLines.setLine(request.getScrollingLineItems());
        parent.setScrolled(scrollingLines);
        Map<String, String> map = request.getPlaceHolders();
        List<FccFormPlaceHolderData> list = new ArrayList<FccFormPlaceHolderData>();
        for (String key : map.keySet())
        {
            FccFormPlaceHolderData placeholder = new FccFormPlaceHolderData();
            placeholder.setId(key);
            placeholder.setValue(map.get(key));
            list.add(placeholder);
        }
        parent.setFixed(list.toArray(new FccFormPlaceHolderData[list.size()]));
        beginTransrequest.setDisplayDataParent(parent);
        return beginTransrequest;
    }

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    private static FccXmlUpdateDisplayRequest convertToFccUpdateDisplayRequest(
            FccUpdateDisplayRequest request)
    {
        FccXmlUpdateDisplayRequest displayRequest = new FccXmlUpdateDisplayRequest();
        displayRequest.setTranCookie(request.getTranCookie());
        displayRequest.setLaneId(request.getLaneId());
        FccDisplayDataParent parent = new FccDisplayDataParent();
        parent.setClearDisplay(request.getClearDisplay());
        FccScrollingLineTextData scrollingLines = new FccScrollingLineTextData();
        scrollingLines.setLine(request.getScrollingLineItems());
        parent.setScrolled(scrollingLines);
        Map<String, String> map = request.getPlaceHolders();
        List<FccFormPlaceHolderData> list = new ArrayList<FccFormPlaceHolderData>();
        for (String key : map.keySet())
        {
            FccFormPlaceHolderData placeholder = new FccFormPlaceHolderData();
            placeholder.setId(key);
            placeholder.setValue(map.get(key));
            list.add(placeholder);
        }
        parent.setFixed(list.toArray(new FccFormPlaceHolderData[list.size()]));
        displayRequest.setDisplayDataParent(parent);
        return displayRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlBeginPaymentRequest convertToFccBeginPaymentRequest(
            FccBeginPaymentRequest request) throws JAXBException
    {
        FccXmlBeginPaymentRequest paymentRequest = new FccXmlBeginPaymentRequest();
        paymentRequest.setReceiptFormat(request.getReceiptFormat());
        paymentRequest.setTenderAmount(request.getTenderAmount());
        paymentRequest.setTranCookie(request.getTranCookie());
        paymentRequest.setTransMode(request.getTransMode());
        paymentRequest.setLaneId(request.getLaneId());
        paymentRequest.setSignatureFormat(request.getSignatureFormat());
        paymentRequest.setReceiptEol(request.getReceiptEol());
        paymentRequest.setReceiptWidth(request.getReceiptWidth());
        paymentRequest.setReceiptMargin(request.getReceiptMargin());
        paymentRequest.setForceManual(request.getForceManual());
        paymentRequest.setSafMode(request.getSafMode());
        paymentRequest.setSuppressSignature(request.getSuppressSignature());
        paymentRequest.setTransMode(request.getTransMode());
        if (request.getPosRequest() != null)
        {
            FccTemplateData templateData = new FccTemplateData();
            templateData.setPosRequestData((FccPosRequestData) request.getPosRequest());
            paymentRequest.setTemplate(templateData);
        }
        return paymentRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlAbortFlowRequest convertToFccAbortFlowRequest(FccAbortFlowRequest request)
            throws JAXBException
    {
        FccXmlAbortFlowRequest abortRequest = new FccXmlAbortFlowRequest();
        abortRequest.setLaneId(request.getLaneId());
        abortRequest.setTranCookie(request.getTranCookie());
        return abortRequest;
    }

    /**
     * @param request
     * @return
     */
    private static FccXmlSignatureCaptureRequest convertToFccSignatureCaptureRequest(
            FccSignatureCaptureRequest request)
    {
        FccXmlSignatureCaptureRequest signatureCaptureRequest = new FccXmlSignatureCaptureRequest();
        signatureCaptureRequest.setLaneId(request.getLaneId());
        Map<String, String> map = request.getPlaceHolders();
        if (map != null)
        {
            List<FccFormPlaceHolderData> list = new ArrayList<FccFormPlaceHolderData>();
            for (String key : map.keySet())
            {
                FccFormPlaceHolderData placeholder = new FccFormPlaceHolderData();
                placeholder.setId(key);
                placeholder.setValue(map.get(key));
                list.add(placeholder);
            }
            signatureCaptureRequest
                    .setPlaceholders(list.toArray(new FccFormPlaceHolderData[list.size()]));
        }
        signatureCaptureRequest.setSigFormat(request.getSigFormat());
        signatureCaptureRequest.setTimeout(request.getTimeout());
        return signatureCaptureRequest;
    }

    /**
     * @param request
     * @return
     */
    private static FccXmlFormEntryRequest convertToFccFormEntryRequest(FccFormEntryRequest request)
    {
        FccXmlFormEntryRequest formEntryRequest = new FccXmlFormEntryRequest();
        formEntryRequest.setLaneId(request.getLaneId());
        formEntryRequest.setAltConfig(request.getAltConfig());
        formEntryRequest.setAuthToken(request.getAuthToken());
        formEntryRequest.setCertificateSource(request.getCertificateSource());
        formEntryRequest.setCertificate(request.getCertificate());
        formEntryRequest.setFormId(request.getFormId());
        formEntryRequest.setSigFormat(request.getSigFormat());
        formEntryRequest.setTimeout(request.getTimeout());
        Map<String, String> map = request.getPlaceHolders();
        if (map != null)
        {
            List<FccFormPlaceHolderData> list = new ArrayList<FccFormPlaceHolderData>();
            for (String key : map.keySet())
            {
                FccFormPlaceHolderData placeholder = new FccFormPlaceHolderData();
                placeholder.setId(key);
                placeholder.setValue(map.get(key));
                list.add(placeholder);
            }
            formEntryRequest.setPlaceholders(list.toArray(new FccFormPlaceHolderData[list.size()]));
        }
        return formEntryRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlBeginReadRequest convertToFccBeginReadRequest(FccBeginReadRequest request)
            throws JAXBException
    {
        FccXmlBeginReadRequest readRequest = new FccXmlBeginReadRequest();
        readRequest.setForceManual(request.getForceManual());
        readRequest.setLaneId(request.getLaneId());
        readRequest.setTranCookie(request.getTranCookie());
        readRequest.setTransType(request.getTransType());
        return readRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlCompleteReferralRequest convertToFccCompleteReferralRequest(
            FccCompleteReferralRequest request) throws JAXBException
    {
        FccXmlCompleteReferralRequest referralRequest = new FccXmlCompleteReferralRequest();
        referralRequest.setLaneId(request.getLaneId());
        referralRequest.setTranCookie(request.getTranCookie());
        referralRequest.setApprovalCode(request.getApprovalCode());
        referralRequest.setResult(request.getResult());
        referralRequest.setApprovedAmount(request.getApprovedAmount());
        return referralRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlCompleteSignatureRequest convertToFccCompleteSignatureRequest(
            FccCompleteSignatureRequest request) throws JAXBException
    {
        FccXmlCompleteSignatureRequest signatureRequest = new FccXmlCompleteSignatureRequest();
        signatureRequest.setLaneId(request.getLaneId());
        signatureRequest.setTranCookie(request.getTranCookie());
        signatureRequest.setResult(request.getResult());
        return signatureRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlEndTransactionRequest convertToFccEndTransactionRequest(
            FccEndTransactionRequest request) throws JAXBException
    {
        FccXmlEndTransactionRequest endTransactionRequest = new FccXmlEndTransactionRequest();
        endTransactionRequest.setLaneId(request.getLaneId());
        endTransactionRequest.setTranCookie(request.getTranCookie());
        return endTransactionRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlEndPaymentRequest convertToFccEndPaymentRequest(
            FccEndPaymentRequest request) throws JAXBException
    {
        FccXmlEndPaymentRequest endPaymentRequest = new FccXmlEndPaymentRequest();
        endPaymentRequest.setLaneId(request.getLaneId());
        endPaymentRequest.setTranCookie(request.getTranCookie());
        return endPaymentRequest;
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    private static FccXmlWaitEventRequest convertToFccWaitEventRequest(FccWaitEventRequest request)
            throws JAXBException
    {
        FccXmlWaitEventRequest waitEventRequest = new FccXmlWaitEventRequest();
        waitEventRequest.setLaneId(request.getLaneId());
        waitEventRequest.setTranCookie(request.getTranCookie());
        waitEventRequest.setSequenceNumber(request.getSequenceNumber());
        waitEventRequest.setTimeout(request.getTimeout());
        return waitEventRequest;
    }

    /**
     * if string is null return a empty string
     * 
     * @param s
     * @return
     */
    private static String getNonNullString(String value)
    {
        String toReturn = value;
        if (toReturn == null)
        {
            toReturn = "";
        }
        return toReturn;
    }

    /**
     * @param str
     * @return
     */
    public static String getMaskedCardNumber(String str)
    {
        int tagStartIndex = -1;

        if ((tagStartIndex = str.indexOf("<CardNumber>")) > 0)
        {
            int tagEndIndex = 0;
            do
            {
                int cardStartIndex = tagStartIndex + 12;
                StringBuffer sb = new StringBuffer(str.substring(0, cardStartIndex));
                tagEndIndex = str.indexOf("</CardNumber>", tagStartIndex);
                sb.append(
                        maskCardNumberFirstSixLastFour(str.substring(cardStartIndex, tagEndIndex)));
                sb.append(str.substring(tagEndIndex, str.length()));
                str = sb.toString();
            }
            while ((tagStartIndex = str.indexOf("<CardNumber>", tagEndIndex)) > 0);
        }
        return str;
    }

    /**
     * Mask all digits of card number except first 6 and last 4
     *
     * @param cardNumber
     *            String card number
     * @return cardNumber String masked card number
     */
    public static String maskCardNumberFirstSixLastFour(String cardNumber)
    {
        if (cardNumber == null || cardNumber.equals(""))
        {
            return cardNumber;
        }
        int len = cardNumber.length();
        char cardArray[] = new char[len];
        if (len > 10)
        {
            cardNumber.getChars(0, 6, cardArray, 0);
            for (int i = 6; i < len - 4; i++)
            {
                cardArray[i] = 'x';
            }
            cardNumber.getChars(len - 4, len, cardArray, len - 4);
            return new String(cardArray);
        }
        else
        {
            return cardNumber;
        }
    }
    
    /**
     * Check for null and empty string value
     * @param s
     * @return
     */
    public static boolean isNotNullAndIsNotEmpty(String s)
    {
        boolean toReturn = false;
        if(s != null && s.trim().length() > 0)
        {
            toReturn = true;
        }
        return toReturn;
    }
}