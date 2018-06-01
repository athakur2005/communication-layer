/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

/**
 * 
 * @author Anil.Thakur
 *
 */
public enum FCCRequestTypeEnum
{
    Abort,
    Auth,
    Cancel,
    Capture,
    CardRead,
    CreateToken,
    DCCRateLookup,
    FreeWayFollowup,
    Followup,
    ForceDeviceUpdate,
    ForceOfflineReplay,
    GetReplayStatus,
    GoOffline,
    GoOnline,
    Heartbeat,
    QueryRequest,
    Refund,
    Sale,
    Signature,
    Special,
    TruncateDatabase,
    UpdateToken,
    Void,
    BeginTransRequest,
    BeginReadRequest,
    UpdateDisplayRequest,
    FormEntryRequest,
    WaitEventRequest,
    SignatureCaptureRequest,
    BeginPaymentRequest,
    CompleteReferralRequest,
    CompleteSignatureRequest,
    EndPaymentRequest,
    AbortFlowRequest,
    EndTransactionRequest;
}