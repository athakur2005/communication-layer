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
public class FccServerResponseData implements Serializable
{
    @XmlElement(name = "POSResponse", required = true)
    private FccPosResponseData posResponse;

    /**
     * @return the posResponse
     */
    public FccPosResponseData getPosResponse()
    {
        return posResponse;
    }

    /**
     * @param posResponse
     *            the posResponse to set
     */
    public void setPosResponse(FccPosResponseData posResponse)
    {
        this.posResponse = posResponse;
    }
}