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
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
/**
 * @author Anil.Thakur
 */
public class FccCommonPoiResponse implements Serializable
{
    @XmlElement(name = "decision", required = true)
    private String decision;

    @XmlElement(name = "errorCode", required = true)
    private String errorCode;

    @XmlElement(name = "message", required = false)
    protected String message;

    /**
     * @return the decision
     */
    public String getDecision()
    {
        return decision;
    }

    /**
     * @param decision
     *            the decision to set
     */
    public void setDecision(String decision)
    {
        this.decision = decision;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode()
    {
        return errorCode;
    }

    /**
     * @param errorCode
     *            the errorCode to set
     */
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
    }
}