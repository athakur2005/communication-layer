/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
/**
 * @author Anil.Thakur
 */
public class FccPaymentResponseData implements Serializable
{
    @XmlElement(name = "cvm", required = true)
    private String cvm;

    @XmlElement(name = "cardType", required = true)
    private String cardType;

    @XmlElement(name = "statusCode", required = true)
    private String statusCode;

    @XmlElement(name = "statusMessage", required = true)
    private String statusMessage;

    @XmlElement(name = "receiptText", required = true)
    private String receiptText;

    @XmlElement(name = "statusName", required = true)
    private String statusName;

    @XmlElement(name = "serverResponse", required = true)
    private FccServerResponseData serverResponse;

    /**
     * @return the statusCode
     */
    public String getStatusCode()
    {
        return statusCode;
    }

    /**
     * @param statusCode
     *            the statusCode to set
     */
    public void setStatusCode(String statusCode)
    {
        this.statusCode = statusCode;
    }

    /**
     * @return the statusMessage
     */
    public String getStatusMessage()
    {
        return statusMessage;
    }

    /**
     * @param statusMessage
     *            the statusMessage to set
     */
    public void setStatusMessage(String statusMessage)
    {
        this.statusMessage = statusMessage;
    }

    /**
     * @return the receiptText
     */
    public String getReceiptText()
    {
        return receiptText;
    }

    /**
     * @param receiptText
     *            the receiptText to set
     */
    public void setReceiptText(String receiptText)
    {
        this.receiptText = receiptText;
    }

    /**
     * @return the serverResponse
     */
    public FccServerResponseData getServerResponse()
    {
        return serverResponse;
    }

    /**
     * @param serverResponse
     *            the serverResponse to set
     */
    public void setServerResponse(FccServerResponseData serverResponse)
    {
        this.serverResponse = serverResponse;
    }

    /**
     * @return the statusName
     */
    public String getStatusName()
    {
        return statusName;
    }

    /**
     * @param statusName
     *            the statusName to set
     */
    public void setStatusName(String statusName)
    {
        this.statusName = statusName;
    }

    /**
     * @return the cvm
     */
    public String getCvm()
    {
        return cvm;
    }

    /**
     * @param cvm
     *            the cvm to set
     */
    public void setCvm(String cvm)
    {
        this.cvm = cvm;
    }

    /**
     * @return the cardType
     */
    public String getCardType()
    {
        return cardType;
    }

    /**
     * @param cardType
     *            the cardType to set
     */
    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

}