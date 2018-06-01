/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.Serializable;

/**
 * @author Anil.Thakur
 */
public class FccCompleteReferralRequest extends FccCommonPoiRequest implements Serializable
{
    private String tranCookie;

    private String approvalCode;

    private String result;

    private String approvedAmount;

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