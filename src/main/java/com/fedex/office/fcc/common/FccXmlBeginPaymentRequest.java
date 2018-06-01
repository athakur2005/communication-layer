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
@XmlRootElement(name = "beginPaymentRequest")
/**
 * @author Anil.Thakur
 */
public class FccXmlBeginPaymentRequest implements FccNamed, Serializable
{
    @XmlElement(name = "laneId", required = true)
    private String laneId;

    @XmlElement(name = "signatureFormat", required = true)
    private String signatureFormat;

    @XmlElement(name = "receiptFormat", required = true)
    private String receiptFormat;

    @XmlElement(name = "receiptEol", required = true)
    private String receiptEol;

    @XmlElement(name = "receiptWidth", required = true)
    private String receiptWidth;

    @XmlElement(name = "receiptMargin", required = true)
    private String receiptMargin;

    @XmlElement(name = "tranCookie", required = true)
    private String tranCookie;

    @XmlElement(name = "forceManual", required = true)
    private String forceManual;

    @XmlElement(name = "safMode", required = true)
    private String safMode;

    @XmlElement(name = "suppressSignature", required = true)
    private String suppressSignature;

    @XmlElement(name = "tenderAmount", required = true)
    private String tenderAmount;

    @XmlElement(name = "template", required = true)
    private FccTemplateData template;

    @XmlElement(name = "transMode", required = true)
    private String transMode;

    public String getName()
    {
        return FCCRequestTypeEnum.BeginPaymentRequest.name();
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
     * @return the template
     */
    public FccTemplateData getTemplate()
    {
        return template;
    }

    /**
     * @param template the template to set
     */
    public void setTemplate(FccTemplateData template)
    {
        this.template = template;
    }
}