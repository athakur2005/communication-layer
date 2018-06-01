package com.fedex.office.fcc.common;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

public class TestClient
{

    public static FccSaleRequest populateSaleRequest(FccSaleRequest request)
    {
        request.setStoreId("1452182011");
        request.setTerminalId("2454874019");
        request.setRequestType("Sale");
        request.setClientEnvironment("POS Client version 6.8.X");
        request.setInvoiceNumber("12345");
        request.setMerchantReferenceCode("E58C537425C0487A");
        // request.setTaxAmount("113.00");
        request.setChargeAmount("10.00");
        request.setTokenType("7");
        request.setWorkstationId("005");
        // request.setReceiptFormat("legacy");
        // request.setVerbalAuthCode("12345");
        // request.setFloorLimit("200.00");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("localhost");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccPosRequestData populatePosRequestData(FccPosRequestData request)
    {
        request.setStoreId("1452182011");
        request.setTerminalId("2454874019");
        request.setRequestType("Sale");
        request.setClientEnvironment("POS Client version 6.8.X");
        request.setInvoiceNumber("12345");
        request.setMerchantReferenceCode("E58C537425C0487A");
        // request.setTaxAmount("113.00");
        request.setChargeAmount("10.00");
        request.setTokenType("7");
        request.setWorkstationId("003");
        request.setReceiptFormat("legacy");
        // request.setVerbalAuthCode("12345");
        // request.setFloorLimit("200.00");
        return request;
    }

    public static FccCardReadRequest populateCardReadRequest(FccCardReadRequest request)
    {
        // request.setStoreId("1452182011");
        // request.setTerminalId("2454874019");
        request.setRequestType("CardRead");
        // request.setClientEnvironment("POS Client version 6.8.X");
        // request.setInvoiceNumber("INV_NUMBER_123456");
        // request.setMerchantReferenceCode("MER_REF_CODE_123456");
        return request;
    }

    public static FccSignatureRequest populateSignatureRequest(FccSignatureRequest request)
    {
        request.setStoreId("1452182011");
        request.setTerminalId("2454874019");
        request.setRequestType("Signature");
        // request.setClientEnvironment("POS Client version 6.8.X");
        request.setInvoiceNumber("123456789");
        request.setMerchantReferenceCode("251CB12D7F1C4ACD");
        request.setSignatureFormat("scd1");
        return request;
    }

    public static FccRefundRequest populateRefundRequest(FccRefundRequest request)
    {
        request.setStoreId("1452182011");
        request.setTerminalId("2454874019");
        request.setRequestType("Refund");
        request.setClientEnvironment("POS Client version 6.8.X");
        request.setInvoiceNumber("INV_NUMBER_123456");
        request.setMerchantReferenceCode("MER_REF_CODE_123456");
        request.setTaxAmount("13.00");
        request.setChargeAmount("25.00");
        // request.setTokenType("TOKEN_TYPE");
        return request;
    }

    public static FccVoidRequest populateVoidRequest(FccVoidRequest request)
    {
        request.setStoreId("1452182011");
        request.setTerminalId("2454874019");
        request.setRequestType("Void");
        request.setClientEnvironment("POS Client version 6.8.X");
        request.setInvoiceNumber("INV_NUMBER_123456");
        request.setMerchantReferenceCode("MER_REF_CODE_123456");
        request.setTaxAmount("13.00");
        request.setChargeAmount("25.00");
        // request.setTokenType("TOKEN_TYPE");
        return request;
    }

    public static FccReplayStatusRequest populateReplayStatusRequest(
            FccReplayStatusRequest replayStatusRequest)
    {
        replayStatusRequest.setStoreId("1452182011");
        replayStatusRequest.setTerminalId("2454874019");
        replayStatusRequest.setRequestType("GetReplayStatus");
        replayStatusRequest.setClientEnvironment("POS Client version 6.8.X");
        replayStatusRequest.setInvoiceNumber("12345");
        replayStatusRequest.setMerchantReferenceCode("E58C537425C0487A");
        replayStatusRequest.setRequestId("00000000000000030495");

        return replayStatusRequest;
    }

    public static FccUpdateDisplayRequest populateLineDisplayRequest(
            FccUpdateDisplayRequest request)
    {
        String[] value = {
                "First line 11                                                                                 $12",
                "Second line 2                                                                         $13",
                "Third line 3                                                                      $14",
                " A very long item that will get truncated by the width of the form" };
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("TOTAL", "123");
        map.put("TAX", "151");
        request.setTranCookie("4096");
        request.setLaneId("0");
        request.setClearDisplay("true");
        request.setScrollingLineItems(value);
        request.setPlaceHolders(map);
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccWaitEventRequest populateWaitEventRequest(FccWaitEventRequest request)
    {
        request.setTimeout("120000");
        request.setLaneId("0");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccEndPaymentRequest populateEndPaymentRequest(FccEndPaymentRequest request)
    {
        request.setLaneId("0");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccAbortFlowRequest populateAbortFlowRequest(FccAbortFlowRequest request)
    {
        request.setLaneId("0");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccEndTransactionRequest populateEndTransactionRequest(
            FccEndTransactionRequest request)
    {
        request.setTranCookie("1024");
        request.setLaneId("0");
        request.setFccProxyServerAddress("172.18.83.104");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("lp-anilthakur");
        request.setFccClientPort("8090");
        request.setFccServerAddress("172.18.83.104");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccCompleteReferralRequest populateCompleteReferralRequest(
            FccCompleteReferralRequest request)
    {
        request.setApprovalCode("approved");
        request.setLaneId("0");
        request.setResult("Approved");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccCompleteSignatureRequest populateCompleteSignatureRequest(
            FccCompleteSignatureRequest request)
    {
        request.setLaneId("0");
        request.setResult("accepted");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccFormEntryRequest populateFormEntryRequest(FccFormEntryRequest request)
    {
        request.setFormId("5");
        request.setTimeout("12000");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("TOTAL", "50");
        map.put("TAX", "15");
        request.setLaneId("0");
        request.setPlaceHolders(map);
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccBeginTransactionRequest populateBeginTransactionRequest(
            FccBeginTransactionRequest request)
    {
        String[] value = {
                "First line 1                                                                                 $12",
                "Second line 1                                                                         $13",
                "Third line 1                                                                      $14",
                " A very long item that will get truncated by the width of the form" };
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("TOTALAMOUNT", "50");
        map.put("TAXAMOUNT", "15");
        request.setLaneId("0");
        request.setScrollingLineItems(value);
        request.setPlaceHolders(map);
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccBeginReadRequest populateBeginReadRequest(FccBeginReadRequest request)
    {
        request.setLaneId("0");
        request.setTransType("payment");
        request.setForceManual("false");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccBeginPaymentRequest populateBeginPaymentRequest(FccBeginPaymentRequest request)
    {
        request.setTransMode("sale");
        request.setLaneId("0");
        request.setSignatureFormat("scd1");
        request.setSuppressSignature("true");
        request.setSafMode("Y");
        request.setTenderAmount("15");
        request.setReceiptFormat("legacy");
        FccPosRequestData requestData = FccTransactionObjectFactory.getPosRequest();
        request.setPosRequest(populatePosRequestData(requestData));
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static FccSignatureCaptureRequest populateSignatureCaptureRequest(
            FccSignatureCaptureRequest request)
    {
        request.setLaneId("0");
        request.setFormId("5");
        request.setSigFormat("scd1");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("TOTAL", "50");
        map.put("TAX", "15");
        request.setLaneId("0");
        request.setPlaceHolders(map);
        request.setTimeout("12000");
        request.setFccProxyServerAddress("localhost");
        request.setFccProxyServerPort("5080");
        request.setFccClientAddress("172.18.83.95");
        request.setFccClientPort("8090");
        request.setFccServerAddress("lp-anilthakur");
        request.setFccServerPort("1011");
        return request;
    }

    public static void main(String[] argv) throws JAXBException, IOException
    {
        FccReplayStatusRequest replayStatusRequest = FccTransactionObjectFactory
                .getReplayStatusRequest();
        populateReplayStatusRequest(replayStatusRequest);

        FccSaleRequest saleRequest = FccTransactionObjectFactory.getSaleRequest();
        populateSaleRequest(saleRequest);

        FccCardReadRequest cardReadRequest = FccTransactionObjectFactory.getCardReadRequest();
        populateCardReadRequest(cardReadRequest);

        /*
         * FccSignatureRequest signatureRequest =
         * FccTransactionObjectFactory.getSignatureRequest();
         * populateSignatureRequest(signatureRequest);
         */
        FccRefundRequest refundRequest = FccTransactionObjectFactory.getRefundRequest();
        populateRefundRequest(refundRequest);

        FccVoidRequest voidRequest = FccTransactionObjectFactory.getVoidRequest();
        populateVoidRequest(voidRequest);

        FccBeginReadRequest beginReadRequest = FccTransactionObjectFactory.getBeginReadRequest();
        populateBeginReadRequest(beginReadRequest);

        FccBeginPaymentRequest beginPaymentRequest = FccTransactionObjectFactory
                .getBeginPaymentRequest();
        populateBeginPaymentRequest(beginPaymentRequest);

        FccUpdateDisplayRequest updateDisplayRequest = FccTransactionObjectFactory
                .getUpdateDisplayRequest();
        populateLineDisplayRequest(updateDisplayRequest);

        FccSignatureCaptureRequest signatureCaptureRequest = FccTransactionObjectFactory
                .getSignatureCaptureRequest();
        populateSignatureCaptureRequest(signatureCaptureRequest);

        FccBeginTransactionRequest beginTranRequest = FccTransactionObjectFactory
                .getBeginTransactionRequest();
        populateBeginTransactionRequest(beginTranRequest);

        FccWaitEventRequest waitEventRequest = FccTransactionObjectFactory.getWaitEventRequest();
        populateWaitEventRequest(waitEventRequest);

        FccEndPaymentRequest endPaymentRequest = FccTransactionObjectFactory.getEndPaymentRequest();
        populateEndPaymentRequest(endPaymentRequest);

        FccEndTransactionRequest endRequest = FccTransactionObjectFactory
                .getEndTransactionRequest();
        populateEndTransactionRequest(endRequest);

        FccCompleteReferralRequest referralRequest = FccTransactionObjectFactory
                .getCompleteReferralRequest();
        populateCompleteReferralRequest(referralRequest);

        FccCompleteSignatureRequest signatureRequest = FccTransactionObjectFactory
                .getCompleteSignatureRequest();
        populateCompleteSignatureRequest(signatureRequest);

        FccFormEntryRequest formEntryRequest = FccTransactionObjectFactory.getFormEntryRequest();
        populateFormEntryRequest(formEntryRequest);

        FccAbortFlowRequest abortFlowRequest = FccTransactionObjectFactory.getAbortFlowRequest();
        populateAbortFlowRequest(abortFlowRequest);

        FccSaleResponse responseFromFCC = null;
        FccCardReadResponse cardReadresponseFromFCC = null;
        FccSignatureResponse signatureresponseFromFCC = null;
        FccRefundResponse refundResponseFromFCC = null;
        FccVoidResponse voidResponseFromFCC = null;
        FccReplayStatusResponse replayStatusResponse = null;
        FccBeginTransactionResponse beginTransactionResponse;
        FccWaitEventResponse waitEventResponse;
        FccSignatureCaptureResponse signatureCaptureResponse;
        FccBeginReadResponse beginReadResponse = null;
        FccBeginPaymentResponse beginpaymentResponse = null;
        FccCompleteReferralResponse referralResponse = null;
        FccCompleteSignatureResponse signatureResponse = null;
        FccFormEntryResponse formEntryResponse = null;
        FccAbortFlowResponse abortFlowResponse = null;

        responseFromFCC = FccCommonUtility.sendSaleRequestAndWaitForResponse(saleRequest);

        FccCommonUtility.sendEndTransactionRequestAndWaitForResponse(endRequest);
        FccCommonUtility.sendBeginTransactionRequestAndWaitForResponse(beginTranRequest);
        beginReadResponse = FccCommonUtility
                .sendBeginReadRequestAndWaitForResponse(beginReadRequest);
        waitEventRequest.setTranCookie(beginReadResponse.getTranCookie());
        waitEventResponse = FccCommonUtility
                .sendWaitEventRequestAndWaitForResponse(waitEventRequest);

        String sequenceNumber = waitEventResponse.getSequenceNumber();
        
        /*beginReadResponse = FccCommonUtility
                .sendBeginReadRequestAndWaitForResponse(beginReadRequest);
        String sequenceNumber = waitEventResponse.getSequenceNumber();
        waitEventRequest.setTranCookie(beginReadResponse.getTranCookie());
        //waitEventRequest.setSequenceNumber(sequenceNumber);
        waitEventResponse = FccCommonUtility
                .sendWaitEventRequestAndWaitForResponse(waitEventRequest);
        
        
        beginPaymentRequest.setTranCookie(beginReadResponse.getTranCookie());
        beginpaymentResponse = FccCommonUtility
                .sendBeginPaymentRequestAndWaitForResponse(beginPaymentRequest);
        sequenceNumber = waitEventResponse.getSequenceNumber();
        waitEventRequest = FccTransactionObjectFactory.getWaitEventRequest();
        populateWaitEventRequest(waitEventRequest);
        waitEventRequest.setSequenceNumber(sequenceNumber);
        //waitEventRequest.setSequenceNumber("0");
        waitEventRequest.setTranCookie(beginReadResponse.getTranCookie());
        waitEventResponse = FccCommonUtility
                .sendWaitEventRequestAndWaitForResponse(waitEventRequest);*/
        
        
        
        beginPaymentRequest.setTranCookie(beginReadResponse.getTranCookie());
        beginpaymentResponse = FccCommonUtility
                .sendBeginPaymentRequestAndWaitForResponse(beginPaymentRequest);
        sequenceNumber = waitEventResponse.getSequenceNumber();
        waitEventRequest = FccTransactionObjectFactory.getWaitEventRequest();
        populateWaitEventRequest(waitEventRequest);
        waitEventRequest.setSequenceNumber(sequenceNumber);
        //waitEventRequest.setSequenceNumber("0");
        waitEventRequest.setTranCookie(beginReadResponse.getTranCookie());
        waitEventResponse = FccCommonUtility
                .sendWaitEventRequestAndWaitForResponse(waitEventRequest);

        endPaymentRequest.setTranCookie(beginReadResponse.getTranCookie());
        FccCommonUtility.sendEndPaymentRequestAndWaitForResponse(endPaymentRequest);
        abortFlowRequest.setTranCookie(beginReadResponse.getTranCookie());
        abortFlowResponse = FccCommonUtility
                .sendAbortFlowRequestAndWaitForResponse(abortFlowRequest);

        // responseFromFCC =
        // FccCommonUtility.sendSaleRequestAndWaitForResponse(saleRequest);
        // replayStatusResponse =
        // FccCommonUtility.sendReplayStatusRequestAndWaitForResponse(replayStatusRequest);
        // cardReadresponseFromFCC =
        // FccCommonUtility.sendCardReadRequestAndWaitForResponse(cardReadRequest);
        // signatureresponseFromFCC =
        // FccCommonUtility.sendSignatureRequestAndWaitForResponse(signatureRequest);
        // refundResponseFromFCC =
        // FccCommonUtility.sendRefundRequestAndWaitForResponse(refundRequest);
        // voidResponseFromFCC =
        // FccCommonUtility.sendVoidRequestAndWaitForResponse(voidRequest);
        System.out.println("DONE");
    }
    // Validation of the required fields - TBD
    // responseFromFCC.setErrorCode(null);
    // ValidationResults results =
    // KinkosFCCUtility.validateSaleResponseFromFCC(responseFromFCC);
    // System.out.println("results.hasErrors()->"+results.hasErrors());
}
