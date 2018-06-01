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
 * @author Rajat.Singhal
 */
public class FccReplayStatusRequest extends FccCommonRequest implements FccNamed, Serializable
{
    @XmlElement(name = "UseDCC", required = true)
    private String useDCC;

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

    @XmlElement(name = "TipAmount", required = false)
    protected String tipAmount;

    @XmlElement(name = "TokenType", required = false)
    protected String tokenType;

    @XmlElement(name = "RequestGuid", required = false)
    protected String requestGuid;

    @XmlElement(name = "receiptFormat", required = false)
    protected String receiptFormat;

    @XmlElement(name = "SignatureFormat", required = false)
    protected String signatureFormat;

    @XmlElement(name = "FloorLimit", required = false)
    protected String floorLimit;

    @XmlElement(name = "CardNumber", required = false)
    protected String cardNumber;

    @XmlElement(name = "ExpiryDate", required = false)
    protected String expiryDate;

    public String getName()
    {
        return FCCRequestTypeEnum.GetReplayStatus.name();
    }

    /**
     * @return the useDCC
     */
    public String getUseDCC()
    {
        return useDCC;
    }

    /**
     * @param useDCC
     *            the useDCC to set
     */
    public void setUseDCC(String useDCC)
    {
        this.useDCC = useDCC;
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
     * @return the tipAmount
     */
    public String getTipAmount()
    {
        return tipAmount;
    }

    /**
     * @param tipAmount
     *            the tipAmount to set
     */
    public void setTipAmount(String tipAmount)
    {
        this.tipAmount = tipAmount;
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
     * @return the requestGuid
     */
    public String getRequestGuid()
    {
        return requestGuid;
    }

    /**
     * @param requestGuid
     *            the requestGuid to set
     */
    public void setRequestGuid(String requestGuid)
    {
        this.requestGuid = requestGuid;
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

    /**
     * @return the floorLimit
     */
    public String getFloorLimit()
    {
        return floorLimit;
    }

    /**
     * @param floorLimit
     *            the floorLimit to set
     */
    public void setFloorLimit(String floorLimit)
    {
        this.floorLimit = floorLimit;
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
}