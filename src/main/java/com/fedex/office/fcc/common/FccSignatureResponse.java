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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "POSResponse")
/**
 * @author Anil.Thakur
 */
public class FccSignatureResponse extends FccCommonResponse implements FccNamed, Serializable
{
    @XmlElement(name = "ApprovedAmount", required = false)
    protected String approvedAmount;

    @XmlElement(name = "Message", required = false)
    protected String message;

    @XmlElement(name = "RequestGuid", required = false)
    protected String requestGuid;

    @XmlElement(name = "DCCAccepted", required = false)
    protected String dccAccepted;

    @XmlElement(name = "SignatureFormat", required = false)
    protected String signatureFormat;

    @XmlElement(name = "Signature", required = false)
    protected String signature;

    public String getName()
    {
        return FCCResponseTypeEnum.SignatureResp.name();
    }

    /**
     * @return the approvedAmount
     */
    public String getApprovedAmount()
    {
        return approvedAmount;
    }

    /**
     * @param approvedAmount
     *            the approvedAmount to set
     */
    public void setApprovedAmount(String approvedAmount)
    {
        this.approvedAmount = approvedAmount;
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    /**
     * @return the requestGuid
     */
    public String getRequestGuid()
    {
        return requestGuid;
    }

    /**
     * @param requestGuid
     *            the requestGuid to set
     */
    public void setRequestGuid(String requestGuid)
    {
        this.requestGuid = requestGuid;
    }

    /**
     * @return the dccAccepted
     */
    public String getDccAccepted()
    {
        return dccAccepted;
    }

    /**
     * @param dccAccepted
     *            the dccAccepted to set
     */
    public void setDccAccepted(String dccAccepted)
    {
        this.dccAccepted = dccAccepted;
    }

    /**
     * @return the signatureFormat
     */
    public String getSignatureFormat()
    {
        return signatureFormat;
    }

    /**
     * @param signatureFormat
     *            the signatureFormat to set
     */
    public void setSignatureFormat(String signatureFormat)
    {
        this.signatureFormat = signatureFormat;
    }

    /**
     * @return the signature
     */
    public String getSignature()
    {
        return signature;
    }

    /**
     * @param signature
     *            the signature to set
     */
    public void setSignature(String signature)
    {
        this.signature = signature;
    }

}