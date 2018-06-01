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
public class FccBeginReadRequest extends FccCommonPoiRequest implements Serializable
{
    private String tranCookie;

    private String forceManual;

    private String transType;

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