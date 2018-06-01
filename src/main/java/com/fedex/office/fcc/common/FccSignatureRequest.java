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
public class FccSignatureRequest extends FccCommonRequest implements FccNamed, Serializable
{

    @XmlElement(name = "SignatureFormat", required = true)
    private String signatureFormat;

    public String getName()
    {
        return FCCRequestTypeEnum.Signature.name();
    }

    /**
     * @return the signatureFormat
     */
    public String getSignatureFormat()
    {
        return signatureFormat;
    }

    /**
     * @param signatureFormat
     *            the signatureFormat to set
     */
    public void setSignatureFormat(String signatureFormat)
    {
        this.signatureFormat = signatureFormat;
    }
}