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
@XmlRootElement(name = "completeReferralRequest")
/**
 * @author Anil.Thakur
 */
public class FccXmlCompleteReferralRequest implements FccNamed, Serializable
{
    @XmlElement(name = "laneId", required = true)
    private String laneId;

    @XmlElement(name = "tranCookie", required = true)
    private String tranCookie;

    @XmlElement(name = "approvalCode", required = true)
    private String approvalCode;

    @XmlElement(name = "result", required = true)
    private String result;

    @XmlElement(name = "approvedAmount", required = true)
    private String approvedAmount;

    public String getName()
    {
        return FCCRequestTypeEnum.CompleteReferralRequest.name();
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

    /**
     * @return the tranCookie
     */
    public String getTranCookie()
    {
        return tranCookie;
    }

    /**
     * @param tranCookie
     *            the tranCookie to set
     */
    public void setTranCookie(String tranCookie)
    {
        this.tranCookie = tranCookie;
    }

    /**
     * @return the approvalCode
     */
    public String getApprovalCode()
    {
        return approvalCode;
    }

    /**
     * @param approvalCode
     *            the approvalCode to set
     */
    public void setApprovalCode(String approvalCode)
    {
        this.approvalCode = approvalCode;
    }

    /**
     * @return the result
     */
    public String getResult()
    {
        return result;
    }

    /**
     * @param result
     *            the result to set
     */
    public void setResult(String result)
    {
        this.result = result;
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

}