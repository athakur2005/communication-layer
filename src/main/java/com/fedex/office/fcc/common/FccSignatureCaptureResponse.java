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
@XmlRootElement(name = "sigCapResponse")
/**
 * @author Anil.Thakur
 */
public class FccSignatureCaptureResponse extends FccCommonPoiResponse
        implements FccNamed, Serializable
{
    @XmlElement(name = "data", required = false)
    protected String data;

    @XmlElement(name = "certificateId", required = false)
    protected String certificateId;

    @XmlElement(name = "laneId", required = false)
    protected String laneId;

    @XmlElement(name = "sigFormat", required = false)
    protected String sigFormat;

    @XmlElement(name = "signature", required = false)
    protected String signature;

    public String getName()
    {
        return FCCResponseTypeEnum.SignatureCaptureResp.name();
    }

    /**
     * @return the data
     */
    public String getData()
    {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(String data)
    {
        this.data = data;
    }

    /**
     * @return the certificateId
     */
    public String getCertificateId()
    {
        return certificateId;
    }

    /**
     * @param certificateId
     *            the certificateId to set
     */
    public void setCertificateId(String certificateId)
    {
        this.certificateId = certificateId;
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
     * @return the sigFormat
     */
    public String getSigFormat()
    {
        return sigFormat;
    }

    /**
     * @param sigFormat
     *            the sigFormat to set
     */
    public void setSigFormat(String sigFormat)
    {
        this.sigFormat = sigFormat;
    }

    /**
     * @return the signature
     */
    public String getSignature()
    {
        return signature;
    }

    /**
     * @param signature
     *            the signature to set
     */
    public void setSignature(String signature)
    {
        this.signature = signature;
    }
}