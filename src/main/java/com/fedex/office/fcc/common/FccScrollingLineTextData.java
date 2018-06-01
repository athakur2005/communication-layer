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

/**
 * @author Anil.Thakur
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
public class FccScrollingLineTextData implements Serializable
{
    @XmlElement(name = "line", required = true, nillable = true)
    private String[] line;

    /**
     * @return the line
     */
    public String[] getLine()
    {
        return line;
    }

    /**
     * @param line
     *            the line to set
     */
    public void setLine(String[] line)
    {
        this.line = line;
    }
}