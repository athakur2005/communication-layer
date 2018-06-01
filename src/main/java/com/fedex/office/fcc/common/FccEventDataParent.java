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
public class FccEventDataParent implements Serializable
{
    @XmlElement(name = "card", required = true)
    private FccCardData cardData;

    @XmlElement(name = "signature", required = true)
    private FccSignatureData signatureData;

    @XmlElement(name = "paymentResponse", required = true)
    private FccPaymentResponseData paymentResponse;

    @XmlElement(name = "referral", required = true)
    private FccReferralData referral;

    /**
     * @return the cardData
     */
    public FccCardData getCardData()
    {
        return cardData;
    }

    /**
     * @param cardData
     *            the cardData to set
     */
    public void setCardData(FccCardData cardData)
    {
        this.cardData = cardData;
    }

    /**
     * @return the signatureData
     */
    public FccSignatureData getSignatureData()
    {
        return signatureData;
    }

    /**
     * @param signatureData
     *            the signatureData to set
     */
    public void setSignatureData(FccSignatureData signatureData)
    {
        this.signatureData = signatureData;
    }

    /**
     * @return the paymentResponse
     */
    public FccPaymentResponseData getPaymentResponse()
    {
        return paymentResponse;
    }

    /**
     * @param paymentResponse
     *            the paymentResponse to set
     */
    public void setPaymentResponse(FccPaymentResponseData paymentResponse)
    {
        this.paymentResponse = paymentResponse;
    }

    /**
     * @return the referral
     */
    public FccReferralData getReferral()
    {
        return referral;
    }

    /**
     * @param referral
     *            the referral to set
     */
    public void setReferral(FccReferralData referral)
    {
        this.referral = referral;
    }
}