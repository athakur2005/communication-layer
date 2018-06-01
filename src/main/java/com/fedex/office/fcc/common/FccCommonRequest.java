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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
/**
 * @author Anil.Thakur
 */
public class FccCommonRequest implements Serializable
{
    @XmlElement(name = "StoreId", required = true)
    private String storeId;

    @XmlElement(name = "TerminalId", required = true)
    private String terminalId;

    @XmlElement(name = "WorkstationId", required = false)
    private String workstationId;

    @XmlElement(name = "ClerkId", required = false)
    private String clerkId;

    @XmlElement(name = "MerchantReferenceCode", required = true)
    protected String merchantReferenceCode;

    @XmlElement(name = "TaxAmount", required = true)
    protected String taxAmount;

    @XmlElement(name = "ChargeAmount", required = true)
    protected String chargeAmount;

    @XmlElement(name = "RequestType", required = true)
    private String requestType;

    @XmlElement(name = "ClientEnvironment", required = true)
    protected String clientEnvironment;

    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;

    @XmlElement(name = "LaneId", required = true)
    protected String laneId;

    @XmlElement(name = "VerbalAuthCode", required = false)
    protected String verbalAuthCode;

    @XmlElement(name = "RequestId", required = false)
    protected String requestId;

    @XmlTransient
    private String fccProxyServerAddress;

    @XmlTransient
    private String fccProxyServerPort;

    @XmlTransient
    private String fccClientAddress;

    @XmlTransient
    private String fccClientPort;

    @XmlTransient
    private String fccServerAddress;

    @XmlTransient
    private String fccServerPort;

    @XmlTransient
    private String posTimeout;
    
    /**
     * @return the storeId
     */
    public String getStoreId()
    {
        return storeId;
    }

    /**
     * @param storeId
     *            the storeId to set
     */
    public void setStoreId(String storeId)
    {
        this.storeId = storeId;
    }

    /**
     * @return the terminalId
     */
    public String getTerminalId()
    {
        return terminalId;
    }

    /**
     * @param terminalId
     *            the terminalId to set
     */
    public void setTerminalId(String terminalId)
    {
        this.terminalId = terminalId;
    }

    /**
     * @return the workstationId
     */
    public String getWorkstationId()
    {
        return workstationId;
    }

    /**
     * @param workstationId
     *            the workstationId to set
     */
    public void setWorkstationId(String workstationId)
    {
        this.workstationId = workstationId;
    }

    /**
     * @return the clerkId
     */
    public String getClerkId()
    {
        return clerkId;
    }

    /**
     * @param clerkId
     *            the clerkId to set
     */
    public void setClerkId(String clerkId)
    {
        this.clerkId = clerkId;
    }

    /**
     * @return the merchantReferenceCode
     */
    public String getMerchantReferenceCode()
    {
        return merchantReferenceCode;
    }

    /**
     * @param merchantReferenceCode
     *            the merchantReferenceCode to set
     */
    public void setMerchantReferenceCode(String merchantReferenceCode)
    {
        this.merchantReferenceCode = merchantReferenceCode;
    }

    /**
     * @return the taxAmount
     */
    public String getTaxAmount()
    {
        return taxAmount;
    }

    /**
     * @param taxAmount
     *            the taxAmount to set
     */
    public void setTaxAmount(String taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    /**
     * @return the chargeAmount
     */
    public String getChargeAmount()
    {
        return chargeAmount;
    }

    /**
     * @param chargeAmount
     *            the chargeAmount to set
     */
    public void setChargeAmount(String chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }

    /**
     * @return the requestType
     */
    public String getRequestType()
    {
        return requestType;
    }

    /**
     * @param requestType
     *            the requestType to set
     */
    public void setRequestType(String requestType)
    {
        this.requestType = requestType;
    }

    /**
     * @return the clientEnvironment
     */
    public String getClientEnvironment()
    {
        return clientEnvironment;
    }

    /**
     * @param clientEnvironment
     *            the clientEnvironment to set
     */
    public void setClientEnvironment(String clientEnvironment)
    {
        this.clientEnvironment = clientEnvironment;
    }

    /**
     * @return the invoiceNumber
     */
    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber
     *            the invoiceNumber to set
     */
    public void setInvoiceNumber(String invoiceNumber)
    {
        this.invoiceNumber = invoiceNumber;
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
     * @return the verbalAuthCode
     */
    public String getVerbalAuthCode()
    {
        return verbalAuthCode;
    }

    /**
     * @param verbalAuthCode
     *            the verbalAuthCode to set
     */
    public void setVerbalAuthCode(String verbalAuthCode)
    {
        this.verbalAuthCode = verbalAuthCode;
    }

    /**
     * @return the requestId
     */
    public String getRequestId()
    {
        return requestId;
    }

    /**
     * @param requestId
     *            the requestId to set
     */
    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

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