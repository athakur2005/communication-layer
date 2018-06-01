/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

/**
 * @author Anil.Thakur
 */
public class FccRequestClassesMapping extends FccCommonMapping
{
    /**
     * 
     */
    public FccRequestClassesMapping()
    {
        super("RequestType");

        // Legacy FCC calls
        addMappingClass(FCCRequestTypeEnum.Sale.name(), FccSaleRequest.class);
        addMappingClass(FCCRequestTypeEnum.Refund.name(), FccRefundRequest.class);
        addMappingClass(FCCRequestTypeEnum.Void.name(), FccVoidRequest.class);
        addMappingClass(FCCRequestTypeEnum.Cancel.name(), FccCancelRequest.class);
        addMappingClass(FCCRequestTypeEnum.Signature.name(), FccSignatureRequest.class);
        addMappingClass(FCCRequestTypeEnum.CardRead.name(), FccCardReadRequest.class);
        addMappingClass(FCCRequestTypeEnum.CardRead.name(), FccCardReadRequest.class);
        addMappingClass(FCCRequestTypeEnum.GetReplayStatus.name(), FccReplayStatusRequest.class);
        // New POI command calls
        addMappingClass(FCCRequestTypeEnum.BeginTransRequest.name(), FccXmlBeginTransactionRequest.class);
        addMappingClass(FCCRequestTypeEnum.UpdateDisplayRequest.name(), FccXmlUpdateDisplayRequest.class);
        addMappingClass(FCCRequestTypeEnum.BeginReadRequest.name(), FccXmlBeginReadRequest.class);
        addMappingClass(FCCRequestTypeEnum.FormEntryRequest.name(), FccXmlFormEntryRequest.class);
        addMappingClass(FCCRequestTypeEnum.WaitEventRequest.name(), FccXmlWaitEventRequest.class);
        addMappingClass(FCCRequestTypeEnum.SignatureCaptureRequest.name(), FccXmlSignatureCaptureRequest.class);
        addMappingClass(FCCRequestTypeEnum.BeginPaymentRequest.name(), FccXmlBeginPaymentRequest.class);
        addMappingClass(FCCRequestTypeEnum.CompleteReferralRequest.name(), FccXmlCompleteReferralRequest.class);
        addMappingClass(FCCRequestTypeEnum.CompleteSignatureRequest.name(), FccXmlCompleteSignatureRequest.class);
        addMappingClass(FCCRequestTypeEnum.EndPaymentRequest.name(), FccXmlEndPaymentRequest.class);
        addMappingClass(FCCRequestTypeEnum.EndTransactionRequest.name(), FccXmlEndTransactionRequest.class);
        addMappingClass(FCCRequestTypeEnum.AbortFlowRequest.name(), FccXmlAbortFlowRequest.class);
    }
}