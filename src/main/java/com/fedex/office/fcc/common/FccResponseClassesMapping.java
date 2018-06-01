/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

/**
 * @author Anil.Thakur
 */
public class FccResponseClassesMapping extends FccCommonMapping
{
    /**
     * 
     */
    public FccResponseClassesMapping()
    {
        super("ErrorCode");

        // Legacy FCC calls
        addMappingClass(FCCResponseTypeEnum.SaleResp.name(), FccSaleResponse.class);
        addMappingClass(FCCResponseTypeEnum.RefundResp.name(), FccRefundResponse.class);
        addMappingClass(FCCResponseTypeEnum.VoidResp.name(), FccVoidResponse.class);
        addMappingClass(FCCResponseTypeEnum.CancelResp.name(), FccCancelResponse.class);
        addMappingClass(FCCResponseTypeEnum.SignatureResp.name(), FccSignatureResponse.class);
        addMappingClass(FCCResponseTypeEnum.CardReadResp.name(), FccCardReadResponse.class);
        addMappingClass(FCCResponseTypeEnum.GetReplayStatusResp.name(),
                FccReplayStatusResponse.class);
        // New POI command calls
        addMappingClass(FCCResponseTypeEnum.BeginTransResp.name(),
                FccBeginTransactionResponse.class);
        addMappingClass(FCCResponseTypeEnum.BeginReadResp.name(), FccBeginReadResponse.class);
        addMappingClass(FCCResponseTypeEnum.BeginPaymentResp.name(), FccBeginPaymentResponse.class);
        addMappingClass(FCCResponseTypeEnum.UpdateDisplayResp.name(),
                FccUpdateDisplayResponse.class);
        addMappingClass(FCCResponseTypeEnum.FormEntryResp.name(), FccFormEntryResponse.class);
        addMappingClass(FCCResponseTypeEnum.WaitEventResp.name(), FccWaitEventResponse.class);
        addMappingClass(FCCResponseTypeEnum.SignatureCaptureResp.name(),
                FccSignatureCaptureResponse.class);
        addMappingClass(FCCResponseTypeEnum.CompleteReferralResp.name(),
                FccCompleteReferralResponse.class);
        addMappingClass(FCCResponseTypeEnum.CompleteSignatureResp.name(),
                FccCompleteSignatureResponse.class);
        addMappingClass(FCCResponseTypeEnum.EndPaymentResp.name(), FccEndPaymentResponse.class);
        addMappingClass(FCCResponseTypeEnum.EndTransactionResp.name(),
                FccEndTransactionResponse.class);
        addMappingClass(FCCResponseTypeEnum.AbortFlowResp.name(), FccAbortFlowResponse.class);
    }
}