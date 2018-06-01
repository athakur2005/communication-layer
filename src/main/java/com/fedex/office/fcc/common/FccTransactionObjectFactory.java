/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

/**
 * @author Anil.Thakur
 */
public class FccTransactionObjectFactory
{

    public static FccSaleRequest getSaleRequest()
    {
        return new FccSaleRequest();
    }

    public static FccVoidRequest getVoidRequest()
    {
        return new FccVoidRequest();
    }

    public static FccRefundRequest getRefundRequest()
    {
        return new FccRefundRequest();
    }

    public static FccCancelRequest getCancelRequest()
    {
        return new FccCancelRequest();
    }

    public static FccCardReadRequest getCardReadRequest()
    {
        return new FccCardReadRequest();
    }

    /*
     * public static FccSignatureRequest getSignatureRequest() { return new
     * FccSignatureRequest(); }
     */

    public static FccReplayStatusRequest getReplayStatusRequest()
    {
        return new FccReplayStatusRequest();
    }

    public static FccBeginTransactionRequest getBeginTransactionRequest()
    {
        return new FccBeginTransactionRequest();
    }

    public static FccBeginReadRequest getBeginReadRequest()
    {
        return new FccBeginReadRequest();
    }

    public static FccBeginPaymentRequest getBeginPaymentRequest()
    {
        return new FccBeginPaymentRequest();
    }

    public static FccUpdateDisplayRequest getUpdateDisplayRequest()
    {
        return new FccUpdateDisplayRequest();
    }

    public static FccEndTransactionRequest getEndTransactionRequest()
    {
        return new FccEndTransactionRequest();
    }

    public static FccFormEntryRequest getFormEntryRequest()
    {
        return new FccFormEntryRequest();
    }

    public static FccSignatureCaptureRequest getSignatureCaptureRequest()
    {
        return new FccSignatureCaptureRequest();
    }

    public static FccWaitEventRequest getWaitEventRequest()
    {
        return new FccWaitEventRequest();
    }

    public static FccCompleteReferralRequest getCompleteReferralRequest()
    {
        return new FccCompleteReferralRequest();
    }

    public static FccCompleteSignatureRequest getCompleteSignatureRequest()
    {
        return new FccCompleteSignatureRequest();
    }

    public static FccEndPaymentRequest getEndPaymentRequest()
    {
        return new FccEndPaymentRequest();
    }

    public static FccPosRequestData getPosRequest()
    {
        return new FccPosRequestData();
    }

    public static FccAbortFlowRequest getAbortFlowRequest()
    {
        return new FccAbortFlowRequest();
    }
}