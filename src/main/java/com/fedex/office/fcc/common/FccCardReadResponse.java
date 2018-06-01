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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "POSResponse")
/**
 * @author Anil.Thakur
 */
public class FccCardReadResponse extends FccCommonResponse implements FccNamed, Serializable
{
    @XmlElement(name = "ApprovedAmount", required = false)
    protected String approvedAmount;

    @XmlElement(name = "Message", required = false)
    private String message;

    @XmlElement(name = "RequestGuid", required = false)
    protected String requestGuid;

    @XmlElement(name = "DCCAccepted", required = false)
    protected String dccAccepted;

    @XmlElement(name = "EntryMode", required = false)
    protected String entryMode;

    @XmlElement(name = "MsrType", required = false)
    protected String msrType;

    @XmlElement(name = "Track1", required = false)
    protected String track1;

    @XmlElement(name = "PinVerified", required = false)
    protected String pinVerified;

    @XmlElement(name = "SignatureRequired", required = false)
    protected String signatureRequired;

    public String getName()
    {
        return FCCResponseTypeEnum.CardReadResp.name();
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
     * @return the entryMode
     */
    public String getEntryMode()
    {
        return entryMode;
    }

    /**
     * @param entryMode
     *            the entryMode to set
     */
    public void setEntryMode(String entryMode)
    {
        this.entryMode = entryMode;
    }

    /**
     * @return the msrType
     */
    public String getMsrType()
    {
        return msrType;
    }

    /**
     * @param msrType
     *            the msrType to set
     */
    public void setMsrType(String msrType)
    {
        this.msrType = msrType;
    }

    /**
     * @return the track1
     */
    public String getTrack1()
    {
        return track1;
    }

    /**
     * @param track1
     *            the track1 to set
     */
    public void setTrack1(String track1)
    {
        this.track1 = track1;
    }

    /**
     * @return the pinVerified
     */
    public String getPinVerified()
    {
        return pinVerified;
    }

    /**
     * @param pinVerified
     *            the pinVerified to set
     */
    public void setPinVerified(String pinVerified)
    {
        this.pinVerified = pinVerified;
    }

    /**
     * @return the signatureRequired
     */
    public String getSignatureRequired()
    {
        return signatureRequired;
    }

    /**
     * @param signatureRequired
     *            the signatureRequired to set
     */
    public void setSignatureRequired(String signatureRequired)
    {
        this.signatureRequired = signatureRequired;
    }
}