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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "displayData")
/**
 * @author Anil.Thakur
 */
public class FccDisplayDataParent implements Serializable
{
    @XmlElement(name = "clearDisplay", required = true)
    private String clearDisplay;

    @XmlElement(name = "ph", required = true)
    @XmlElementWrapper(name = "placeholders", required = true)
    private FccFormPlaceHolderData[] fixed;

    @XmlElement(name = "scrollingLines", required = true)
    private FccScrollingLineTextData scrolled;

    /**
     * @return the fixed
     */
    public FccFormPlaceHolderData[] getFixed()
    {
        return fixed;
    }

    /**
     * @param fixed
     *            the fixed to set
     */
    public void setFixed(FccFormPlaceHolderData[] fixed)
    {
        this.fixed = fixed;
    }

    /**
     * @return the scrolled
     */
    public FccScrollingLineTextData getScrolled()
    {
        return scrolled;
    }

    /**
     * @param scrolled
     *            the scrolled to set
     */
    public void setScrolled(FccScrollingLineTextData scrolled)
    {
        this.scrolled = scrolled;
    }

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
}