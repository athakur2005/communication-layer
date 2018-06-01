/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.Serializable;

/**
 * @author Anil.Thakur
 */
public class FccCommonPoiRequest implements Serializable
{
    private String laneId;

    private String fccProxyServerAddress;

    private String fccProxyServerPort;

    private String fccClientAddress;

    private String fccClientPort;

    private String fccServerAddress;

    private String fccServerPort;
    
    private String posTimeout;
    
    /**
     * @return the fccProxyServerAddress
     */
    public String getFccProxyServerAddress()
    {
        return fccProxyServerAddress;
    }

    /**
     * @param fccProxyServerAddress
     *            the fccProxyServerAddress to set
     */
    public void setFccProxyServerAddress(String fccProxyServerAddress)
    {
        this.fccProxyServerAddress = fccProxyServerAddress;
    }

    /**
     * @return the fccProxyServerPort
     */
    public String getFccProxyServerPort()
    {
        return fccProxyServerPort;
    }

    /**
     * @param fccProxyServerPort
     *            the fccProxyServerPort to set
     */
    public void setFccProxyServerPort(String fccProxyServerPort)
    {
        this.fccProxyServerPort = fccProxyServerPort;
    }

    /**
     * @return the fccClientAddress
     */
    public String getFccClientAddress()
    {
        return fccClientAddress;
    }

    /**
     * @param fccClientAddress
     *            the fccClientAddress to set
     */
    public void setFccClientAddress(String fccClientAddress)
    {
        this.fccClientAddress = fccClientAddress;
    }

    /**
     * @return the fccClientPort
     */
    public String getFccClientPort()
    {
        return fccClientPort;
    }

    /**
     * @param fccClientPort
     *            the fccClientPort to set
     */
    public void setFccClientPort(String fccClientPort)
    {
        this.fccClientPort = fccClientPort;
    }

    /**
     * @return the fccServerAddress
     */
    public String getFccServerAddress()
    {
        return fccServerAddress;
    }

    /**
     * @param fccServerAddress
     *            the fccServerAddress to set
     */
    public void setFccServerAddress(String fccServerAddress)
    {
        this.fccServerAddress = fccServerAddress;
    }

    /**
     * @return the fccServerPort
     */
    public String getFccServerPort()
    {
        return fccServerPort;
    }

    /**
     * @param fccServerPort
     *            the fccServerPort to set
     */
    public void setFccServerPort(String fccServerPort)
    {
        this.fccServerPort = fccServerPort;
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
     * @return the posTimeout
     */
    public String getPosTimeout()
    {
        return posTimeout;
    }

    /**
     * @param posTimeout the posTimeout to set
     */
    public void setPosTimeout(String posTimeout)
    {
        this.posTimeout = posTimeout;
    }
}