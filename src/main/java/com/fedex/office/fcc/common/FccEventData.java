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
public class FccEventData implements Serializable
{
    @XmlElement(name = "card", required = true)
    private FccCardData cardData;

    @XmlElement(name = "signature", required = true)
    private FccEventSignatureData signatureData;

    @XmlElement(name = "paymentResponse", required = true)
    private FccEventPaymentData paymentResponse;

    @XmlElement(name = "referral", required = true)
    private FccEventReferralData referral;

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
    public FccEventSignatureData getSignatureData()
    {
        return signatureData;
    }

    /**
     * @param signatureData the signatureData to set
     */
    public void setSignatureData(FccEventSignatureData signatureData)
    {
        this.signatureData = signatureData;
    }

    /**
     * @return the paymentResponse
     */
    public FccEventPaymentData getPaymentResponse()
    {
        return paymentResponse;
    }

    /**
     * @param paymentResponse the paymentResponse to set
     */
    public void setPaymentResponse(FccEventPaymentData paymentResponse)
    {
        this.paymentResponse = paymentResponse;
    }

    /**
     * @return the referral
     */
    public FccEventReferralData getReferral()
    {
        return referral;
    }

    /**
     * @param referral the referral to set
     */
    public void setReferral(FccEventReferralData referral)
    {
        this.referral = referral;
    }
}