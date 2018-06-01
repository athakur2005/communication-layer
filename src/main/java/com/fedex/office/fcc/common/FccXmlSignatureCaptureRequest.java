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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "sigCapRequest")
/**
 * @author Anil.Thakur
 */
public class FccXmlSignatureCaptureRequest implements FccNamed, Serializable
{
    @XmlElement(name = "altConfig", required = true)
    private String altConfig;

    @XmlElement(name = "certificate", required = true)
    private String certificate;

    @XmlElement(name = "formId", required = true)
    private String formId;

    @XmlElement(name = "ph", required = true)
    @XmlElementWrapper(name = "placeholders", required = true)
    private FccFormPlaceHolderData[] placeholders;

    @XmlElement(name = "sigFormat", required = true)
    private String sigFormat = "false";

    @XmlElement(name = "timeout", required = true)
    private String timeout;

    @XmlElement(name = "laneId", required = true)
    private String laneId;

    public String getName()
    {
        return FCCRequestTypeEnum.SignatureCaptureRequest.name();
    }

    /**
     * @return the altConfig
     */
    public String getAltConfig()
    {
        return altConfig;
    }

    /**
     * @param altConfig
     *            the altConfig to set
     */
    public void setAltConfig(String altConfig)
    {
        this.altConfig = altConfig;
    }

    /**
     * @return the certificate
     */
    public String getCertificate()
    {
        return certificate;
    }

    /**
     * @param certificate
     *            the certificate to set
     */
    public void setCertificate(String certificate)
    {
        this.certificate = certificate;
    }

    /**
     * @return the formId
     */
    public String getFormId()
    {
        return formId;
    }

    /**
     * @param formId
     *            the formId to set
     */
    public void setFormId(String formId)
    {
        this.formId = formId;
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
     * @return the timeout
     */
    public String getTimeout()
    {
        return timeout;
    }

    /**
     * @param timeout
     *            the timeout to set
     */
    public void setTimeout(String timeout)
    {
        this.timeout = timeout;
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
     * @return the placeholders
     */
    public FccFormPlaceHolderData[] getPlaceholders()
    {
        return placeholders;
    }

    /**
     * @param placeholders
     *            the placeholders to set
     */
    public void setPlaceholders(FccFormPlaceHolderData[] placeholders)
    {
        this.placeholders = placeholders;
    }
}