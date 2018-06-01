/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Anil.Thakur
 */
@SuppressWarnings("serial")
public class FccSignatureCaptureRequest extends FccCommonPoiRequest implements Serializable
{
    private String altConfig;

    private String certificate;

    private String formId;

    private Map<String, String> placeHolders;

    private String sigFormat;

    private String timeout;

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
     * @return the placeHolders
     */
    public Map<String, String> getPlaceHolders()
    {
        return placeHolders;
    }

    /**
     * @param placeHolders
     *            the placeHolders to set
     */
    public void setPlaceHolders(Map<String, String> placeHolders)
    {
        this.placeHolders = placeHolders;
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
}