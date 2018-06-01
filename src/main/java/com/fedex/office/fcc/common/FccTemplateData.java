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
public class FccTemplateData implements Serializable
{
    @XmlElement(name = "POSRequest", required = true)
    private FccPosRequestData posRequestData;

    /**
     * @return the posRequestData
     */
    public FccPosRequestData getPosRequestData()
    {
        return posRequestData;
    }

    /**
     * @param posRequestData
     *            the posRequestData to set
     */
    public void setPosRequestData(FccPosRequestData posRequestData)
    {
        this.posRequestData = posRequestData;
    }
}