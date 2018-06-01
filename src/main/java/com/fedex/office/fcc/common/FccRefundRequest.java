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
public class FccRefundRequest extends FccCommonRequest implements FccNamed, Serializable
{
    @XmlElement(name = "IndustryType", required = false)
    protected String industryType;

    @XmlElement(name = "FirstName", required = false)
    protected String firstName;

    @XmlElement(name = "LastName", required = false)
    protected String lastName;

    @XmlElement(name = "Street1", required = false)
    protected String street1;

    @XmlElement(name = "Street2", required = false)
    protected String street2;

    @XmlElement(name = "City", required = false)
    protected String city;

    @XmlElement(name = "State", required = false)
    protected String state;

    @XmlElement(name = "PostalCode", required = false)
    protected String postalCode;

    @XmlElement(name = "TokenType", required = false)
    protected String tokenType;

    @XmlElement(name = "receiptFormat", required = false)
    protected String receiptFormat;

    @XmlElement(name = "CardNumber", required = false)
    protected String cardNumber;

    @XmlElement(name = "ExpiryDate", required = false)
    protected String expiryDate;

    @XmlElement(name = "SafMode", required = false)
    protected String SafMode;

    public String getName()
    {
        return FCCRequestTypeEnum.Refund.name();
    }

    /**
     * @return the industryType
     */
    public String getIndustryType()
    {
        return industryType;
    }

    /**
     * @param industryType
     *            the industryType to set
     */
    public void setIndustryType(String industryType)
    {
        this.industryType = industryType;
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the street1
     */
    public String getStreet1()
    {
        return street1;
    }

    /**
     * @param street1
     *            the street1 to set
     */
    public void setStreet1(String street1)
    {
        this.street1 = street1;
    }

    /**
     * @return the street2
     */
    public String getStreet2()
    {
        return street2;
    }

    /**
     * @param street2
     *            the street2 to set
     */
    public void setStreet2(String street2)
    {
        this.street2 = street2;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode()
    {
        return postalCode;
    }

    /**
     * @param postalCode
     *            the postalCode to set
     */
    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    /**
     * @return the tokenType
     */
    public String getTokenType()
    {
        return tokenType;
    }

    /**
     * @param tokenType
     *            the tokenType to set
     */
    public void setTokenType(String tokenType)
    {
        this.tokenType = tokenType;
    }

    /**
     * @return the receiptFormat
     */
    public String getReceiptFormat()
    {
        return receiptFormat;
    }

    /**
     * @param receiptFormat
     *            the receiptFormat to set
     */
    public void setReceiptFormat(String receiptFormat)
    {
        this.receiptFormat = receiptFormat;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber()
    {
        return cardNumber;
    }

    /**
     * @param cardNumber
     *            the cardNumber to set
     */
    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate()
    {
        return expiryDate;
    }

    /**
     * @param expiryDate
     *            the expiryDate to set
     */
    public void setExpiryDate(String expiryDate)
    {
        this.expiryDate = expiryDate;
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