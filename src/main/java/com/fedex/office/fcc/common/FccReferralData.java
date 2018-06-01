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
public class FccReferralData implements Serializable
{
    @XmlElement(name = "type", required = true)
    private String type;

    @XmlElement(name = "tvr", required = true)
    private String tvr;

    @XmlElement(name = "paymentAmount", required = true)
    private String paymentAmount;

    @XmlElement(name = "phoneNumber", required = true)
    private String phoneNumber;

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @return the tvr
     */
    public String getTvr()
    {
        return tvr;
    }

    /**
     * @param tvr
     *            the tvr to set
     */
    public void setTvr(String tvr)
    {
        this.tvr = tvr;
    }

    /**
     * @return the paymentAmount
     */
    public String getPaymentAmount()
    {
        return paymentAmount;
    }

    /**
     * @param paymentAmount
     *            the paymentAmount to set
     */
    public void setPaymentAmount(String paymentAmount)
    {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param phoneNumber
     *            the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}