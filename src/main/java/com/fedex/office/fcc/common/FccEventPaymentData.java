/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2017 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
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
public class FccEventPaymentData implements Serializable
{
    @XmlElement(name = "statusCode", required = true)
    private String statusCode;

    @XmlElement(name = "statusMessage", required = true)
    private String statusMessage;
    
    @XmlElement(name = "receiptText", required = true)
    private String receiptText;

    /**
     * @return the statusCode
     */
    public String getStatusCode()
    {
        return statusCode;
    }

    /**
     * @param statusCode the statusCode to set
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
     * @param statusMessage the statusMessage to set
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
     * @param receiptText the receiptText to set
     */
    public void setReceiptText(String receiptText)
    {
        this.receiptText = receiptText;
    }

}