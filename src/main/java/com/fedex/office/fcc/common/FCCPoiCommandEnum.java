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
public enum FCCPoiCommandEnum
{
    BeginTransRequest("/poi/beginTrans"),
    UpdateDisplayRequest("/poi/updateDisplay"),
    BeginReadRequest("/poi/beginRead"),
    FormEntryRequest("/poi/formEntry"),
    WaitEventRequest("/poi/waitEvent"),
    SignatureCaptureRequest("/poi/sigCap"),
    BeginPaymentRequest("/poi/beginPayment"),
    CompleteReferralRequest("/poi/completeReferral"),
    CompleteSignatureRequest("/poi/completeSignature"),
    EndPaymentRequest("/poi/endPayment"),
    AbortFlowRequest("/poi/abortFlow"),
    EndTransactionRequest("/poi/endTrans");
    
    private String value;

    /**
     * 
     * @param value
     */
    private FCCPoiCommandEnum(String value)
    {
        this.value = value;
    }
    
    /**
     * Return the poi url for a given command
     * @return
     */
    String getPoiPath()
    {
        return value;
    }
}