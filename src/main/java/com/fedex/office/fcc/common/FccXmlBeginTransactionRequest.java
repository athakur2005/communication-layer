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
@XmlRootElement(name = "beginTransRequest")
/**
 * @author Anil.Thakur
 */
public class FccXmlBeginTransactionRequest implements FccNamed, Serializable
{
    @XmlElement(name = "laneId", required = true)
    private String laneId;

    @XmlElement(name = "displayData", required = true)
    private FccDisplayDataParent displayDataParent;

    public String getName()
    {
        return FCCRequestTypeEnum.BeginTransRequest.name();
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
     * @return the displayDataParent
     */
    public FccDisplayDataParent getDisplayDataParent()
    {
        return displayDataParent;
    }

    /**
     * @param displayDataParent
     *            the displayDataParent to set
     */
    public void setDisplayDataParent(FccDisplayDataParent displayDataParent)
    {
        this.displayDataParent = displayDataParent;
    }
}