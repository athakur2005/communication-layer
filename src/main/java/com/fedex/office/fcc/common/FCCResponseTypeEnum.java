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
public enum FCCResponseTypeEnum
{
    AbortResp,
    AuthResp,
    CancelResp,
    CaptureResp,
    CardReadResp,
    CreateTokenResp,
    DCCRateLookupResp,
    FreeWayFollowupResp,
    FollowupResp,
    ForceDeviceUpdateResp,
    ForceOfflineReplayResp,
    GetReplayStatusResp,
    GoOfflineResp,
    GoOnlineResp,
    HeartbeatResp,
    QueryRequestResp,
    RefundResp,
    SaleResp,
    SignatureResp,
    SpecialResp,
    TruncateDatabaseResp,
    UpdateTokenResp,
    VoidResp,
    BeginTransResp,
    BeginReadResp,
    BeginPaymentResp,
    SignatureCaptureResp,
    UpdateDisplayResp,
    FormEntryResp,
    WaitEventResp,
    CompleteReferralResp,
    CompleteSignatureResp,
    EndPaymentResp,
    AbortFlowResp,
    EndTransactionResp;
}