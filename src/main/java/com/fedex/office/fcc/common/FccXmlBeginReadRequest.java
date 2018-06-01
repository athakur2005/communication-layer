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
@XmlRootElement(name = "beginReadRequest")
/**
 * @author Anil.Thakur
 */
public class FccXmlBeginReadRequest implements FccNamed, Serializable
{
    @XmlElement(name = "laneId", required = true)
    private String laneId;

    @XmlElement(name = "tranCookie", required = true)
    private String tranCookie;

    @XmlElement(name = "forceManual", required = true)
    private String forceManual;

    @XmlElement(name = "transType", required = true)
    private String transType;

    public String getName()
    {
        return FCCRequestTypeEnum.BeginReadRequest.name();
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
     * @return the transType
     */
    public String getTransType()
    {
        return transType;
    }

    /**
     * @param transType
     *            the transType to set
     */
    public void setTransType(String transType)
    {
        this.transType = transType;
    }
}