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
@XmlRootElement(name = "waitEventResponse")
/**
 * @author Anil.Thakur
 */
public class FccWaitEventResponse extends FccCommonPoiResponse implements FccNamed, Serializable
{
    @XmlElement(name = "tranCookie", required = false)
    protected String tranCookie;

    @XmlElement(name = "sequenceNumber", required = false)
    protected String sequenceNumber;

    @XmlElement(name = "eventType", required = false)
    protected String eventType;

    @XmlElement(name = "eventData", required = false)
    protected FccEventDataParent eventData;

    public String getName()
    {
        return FCCResponseTypeEnum.WaitEventResp.name();
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
     * @return the sequenceNumber
     */
    public String getSequenceNumber()
    {
        return sequenceNumber;
    }

    /**
     * @param sequenceNumber
     *            the sequenceNumber to set
     */
    public void setSequenceNumber(String sequenceNumber)
    {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * @return the eventType
     */
    public String getEventType()
    {
        return eventType;
    }

    /**
     * @param eventType
     *            the eventType to set
     */
    public void setEventType(String eventType)
    {
        this.eventType = eventType;
    }

    /**
     * @return the eventData
     */
    public FccEventDataParent getEventData()
    {
        return eventData;
    }

    /**
     * @param eventData
     *            the eventData to set
     */
    public void setEventData(FccEventDataParent eventData)
    {
        this.eventData = eventData;
    }
}