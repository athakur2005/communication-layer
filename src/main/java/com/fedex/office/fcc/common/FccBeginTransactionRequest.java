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
public class FccBeginTransactionRequest extends FccCommonPoiRequest implements Serializable
{
    private String[] scrollingLineItems;

    private Map<String, String> placeHolders;

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
}