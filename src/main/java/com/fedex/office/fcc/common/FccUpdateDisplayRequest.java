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
public class FccUpdateDisplayRequest extends FccCommonPoiRequest implements Serializable
{
    private String clearDisplay;
    private String[] scrollingLineItems;
    private Map<String, String> placeHolders;
    private String tranCookie;

    /**
     * @return the clearDisplay
     */
    public String getClearDisplay()
    {
        return clearDisplay;
    }

    /**
     * @param clearDisplay
     *            the clearDisplay to set
     */
    public void setClearDisplay(String clearDisplay)
    {
        this.clearDisplay = clearDisplay;
    }

    /**
     * @return the scrollingLineItems
     */
    public String[] getScrollingLineItems()
    {
        return scrollingLineItems;
    }

    /**
     * @param scrollingLineItems
     *            the scrollingLineItems to set
     */
    public void setScrollingLineItems(String[] scrollingLineItems)
    {
        this.scrollingLineItems = scrollingLineItems;
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