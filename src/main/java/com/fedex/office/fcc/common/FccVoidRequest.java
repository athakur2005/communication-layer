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
@XmlRootElement(name = "POSRequest")
/**
 * @author Anil.Thakur
 */
public class FccVoidRequest extends FccCommonRequest implements FccNamed, Serializable
{

    @XmlElement(name = "SafMode", required = false)
    protected String SafMode;

    public String getName()
    {
        return FCCRequestTypeEnum.Void.name();
    }

    /**
     * @return the safMode
     */
    public String getSafMode()
    {
        return SafMode;
    }

    /**
     * @param safMode
     *            the safMode to set
     */
    public void setSafMode(String safMode)
    {
        SafMode = safMode;
    }
}