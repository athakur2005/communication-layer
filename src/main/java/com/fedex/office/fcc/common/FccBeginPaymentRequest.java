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
public class FccBeginPaymentRequest extends FccCommonPoiRequest implements Serializable
{
    private String tranCookie;

    private String forceManual;

    private String receiptFormat;

    private String receiptEol;

    private String receiptWidth;

    private String receiptMargin;

    private String signatureFormat;

    private String safMode;

    private String suppressSignature;

    private String tenderAmount;

    private FccPosRequestData posRequest;

    private String transMode;

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
     * @return the forceManual
     */
    public String getForceManual()
    {
        return forceManual;
    }

    /**
     * @param forceManual
     *            the forceManual to set
     */
    public void setForceManual(String forceManual)
    {
        this.forceManual = forceManual;
    }

    /**
     * @return the receiptFormat
     */
    public String getReceiptFormat()
    {
        return receiptFormat;
    }

    /**
     * @param receiptFormat
     *            the receiptFormat to set
     */
    public void setReceiptFormat(String receiptFormat)
    {
        this.receiptFormat = receiptFormat;
    }

    /**
     * @return the receiptEol
     */
    public String getReceiptEol()
    {
        return receiptEol;
    }

    /**
     * @param receiptEol
     *            the receiptEol to set
     */
    public void setReceiptEol(String receiptEol)
    {
        this.receiptEol = receiptEol;
    }

    /**
     * @return the receiptWidth
     */
    public String getReceiptWidth()
    {
        return receiptWidth;
    }

    /**
     * @param receiptWidth
     *            the receiptWidth to set
     */
    public void setReceiptWidth(String receiptWidth)
    {
        this.receiptWidth = receiptWidth;
    }

    /**
     * @return the receiptMargin
     */
    public String getReceiptMargin()
    {
        return receiptMargin;
    }

    /**
     * @param receiptMargin
     *            the receiptMargin to set
     */
    public void setReceiptMargin(String receiptMargin)
    {
        this.receiptMargin = receiptMargin;
    }

    /**
     * @return the signatureFormat
     */
    public String getSignatureFormat()
    {
        return signatureFormat;
    }

    /**
     * @param signatureFormat
     *            the signatureFormat to set
     */
    public void setSignatureFormat(String signatureFormat)
    {
        this.signatureFormat = signatureFormat;
    }

    /**
     * @return the safMode
     */
    public String getSafMode()
    {
        return safMode;
    }

    /**
     * @param safMode
     *            the safMode to set
     */
    public void setSafMode(String safMode)
    {
        this.safMode = safMode;
    }

    /**
     * @return the suppressSignature
     */
    public String getSuppressSignature()
    {
        return suppressSignature;
    }

    /**
     * @param suppressSignature
     *            the suppressSignature to set
     */
    public void setSuppressSignature(String suppressSignature)
    {
        this.suppressSignature = suppressSignature;
    }

    /**
     * @return the tenderAmount
     */
    public String getTenderAmount()
    {
        return tenderAmount;
    }

    /**
     * @param tenderAmount
     *            the tenderAmount to set
     */
    public void setTenderAmount(String tenderAmount)
    {
        this.tenderAmount = tenderAmount;
    }

    /**
     * @return the transMode
     */
    public String getTransMode()
    {
        return transMode;
    }

    /**
     * @param transMode
     *            the transMode to set
     */
    public void setTransMode(String transMode)
    {
        this.transMode = transMode;
    }

    /**
     * @return the posRequest
     */
    public FccPosRequestData getPosRequest()
    {
        return posRequest;
    }

    /**
     * @param posRequest
     *            the posRequest to set
     */
    public void setPosRequest(FccPosRequestData posRequest)
    {
        this.posRequest = posRequest;
    }
}