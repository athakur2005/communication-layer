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
@XmlRootElement(name = "completeSignatureResponse")
/**
 * @author Anil.Thakur
 */
public class FccCompleteSignatureResponse extends FccCommonPoiResponse
        implements FccNamed, Serializable
{
    @XmlElement(name = "laneId", required = true)
    private String laneId;

    @XmlElement(name = "tranCookie", required = true)
    private String tranCookie;

    public String getName()
    {
        return FCCResponseTypeEnum.CompleteReferralResp.name();
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
}