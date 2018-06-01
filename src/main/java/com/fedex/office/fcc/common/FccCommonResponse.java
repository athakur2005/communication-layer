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
public class FccCommonResponse implements Serializable
{
    @XmlElement(name = "Decision", required = true)
    private String decision;

    @XmlElement(name = "ErrorCode", required = true)
    private String errorCode;

    @XmlElement(name = "TransactionId", required = false)
    protected String transactionId;

    @XmlElement(name = "RequestId", required = false)
    protected String requestId;

    @XmlElement(name = "MerchantReferenceCode", required = false)
    protected String merchantReferenceCode;

    @XmlElement(name = "LaneId", required = false)
    protected String laneId;

    /**
     * @return the decision
     */
    public String getDecision()
    {
        return decision;
    }

    /**
     * @param decision
     *            the decision to set
     */
    public void setDecision(String decision)
    {
        this.decision = decision;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode()
    {
        return errorCode;
    }

    /**
     * @param errorCode
     *            the errorCode to set
     */
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId()
    {
        return transactionId;
    }

    /**
     * @param transactionId
     *            the transactionId to set
     */
    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    /**
     * @return the requestId
     */
    public String getRequestId()
    {
        return requestId;
    }

    /**
     * @param requestId
     *            the requestId to set
     */
    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    /**
     * @return the merchantReferenceCode
     */
    public String getMerchantReferenceCode()
    {
        return merchantReferenceCode;
    }

    /**
     * @param merchantReferenceCode
     *            the merchantReferenceCode to set
     */
    public void setMerchantReferenceCode(String merchantReferenceCode)
    {
        this.merchantReferenceCode = merchantReferenceCode;
    }

    /**
     * @return the laneId
     */
    public String getLaneId()
    {
        return laneId;
    }

    /**
     * @param laneId
     *            the laneId to set
     */
    public void setLaneId(String laneId)
    {
        this.laneId = laneId;
    }
}