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
@XmlRootElement(name = "")
/**
 * @author Anil.Thakur
 */
public class FccPosResponseData extends FccCommonResponse implements FccNamed, Serializable
{
    @XmlElement(name = "ApprovalCode", required = false)
    protected String approvalCode;

    @XmlElement(name = "ApprovedAmount", required = false)
    protected String approvedAmount;

    @XmlElement(name = "AVSCode", required = false)
    private String avsCode;

    @XmlElement(name = "CVVCode", required = false)
    private String cvvCode;

    @XmlElement(name = "ExpiryDate", required = false)
    protected String expiryDate;

    @XmlElement(name = "MaskedCardNumber", required = false)
    protected String maskedCardNumber;

    @XmlElement(name = "Token", required = false)
    protected String token;

    @XmlElement(name = "ExchangeRate", required = false)
    protected String exchangeRate;

    @XmlElement(name = "ForeignCurrencyAlpha", required = false)
    protected String foreignCurrencyAlpha;

    @XmlElement(name = "ForeignAmount", required = false)
    protected String foreignAmount;

    @XmlElement(name = "Margin", required = false)
    protected String margin;

    @XmlElement(name = "emvAID", required = false)
    protected String emvAID;

    @XmlElement(name = "emvTVR", required = false)
    protected String emvTVR;

    @XmlElement(name = "emvIAD", required = false)
    protected String emvIAD;

    @XmlElement(name = "emvTSI", required = false)
    protected String emvTSI;

    @XmlElement(name = "emvARC", required = false)
    protected String emvARC;

    @XmlElement(name = "ChipData", required = false)
    protected String chipData;

    @XmlElement(name = "Tag50", required = false)
    protected String tag50;

    @XmlElement(name = "Tag5F2A", required = false)
    protected String tag5F2A;

    @XmlElement(name = "Tag5F34", required = false)
    protected String tag5F34;

    @XmlElement(name = "Tag82", required = false)
    protected String tag82;

    @XmlElement(name = "Tag95", required = false)
    protected String tag95;

    @XmlElement(name = "Tag9A", required = false)
    protected String tag9A;

    @XmlElement(name = "Tag9C", required = false)
    protected String tag9C;

    @XmlElement(name = "Tag9F02", required = false)
    protected String tag9F02;

    @XmlElement(name = "Tag9F03", required = false)
    protected String tag9F03;

    @XmlElement(name = "Tag9F07", required = false)
    protected String tag9F07;

    @XmlElement(name = "Tag9F0D", required = false)
    protected String tag9F0D;

    @XmlElement(name = "Tag9F0E", required = false)
    protected String tag9F0E;

    @XmlElement(name = "Tag9F0F", required = false)
    protected String tag9F0F;

    @XmlElement(name = "Tag9F10", required = false)
    protected String tag9F10;

    @XmlElement(name = "Tag9F12", required = false)
    protected String tag9F12;

    @XmlElement(name = "Tag9F1A", required = false)
    protected String tag9F1A;

    @XmlElement(name = "Tag9F26", required = false)
    protected String tag9F26;

    @XmlElement(name = "Tag9F27", required = false)
    protected String tag9F27;

    @XmlElement(name = "Tag9F34", required = false)
    protected String tag9F34;

    @XmlElement(name = "Tag9F36", required = false)
    protected String tag9F36;

    @XmlElement(name = "Tag9F37", required = false)
    protected String tag9F37;

    @XmlElement(name = "CVMMethod", required = false)
    protected String cvmMethod;

    @XmlElement(name = "Message", required = false)
    private String message;

    @XmlElement(name = "RequestGuid", required = false)
    protected String requestGuid;

    @XmlElement(name = "CardType", required = false)
    protected String cardType;

    @XmlElement(name = "NameOnCard", required = false)
    protected String nameOnCard;

    @XmlElement(name = "EntryMode", required = false)
    protected String entryMode;

    @XmlElement(name = "ReceiptText", required = false)
    protected String receiptText;

    @XmlElement(name = "PinVerified", required = false)
    protected String pinVerified;

    @XmlElement(name = "SignatureRequired", required = false)
    protected String signatureRequired;

    @XmlElement(name = "DCCAccepted", required = false)
    protected String dccAccepted;

    @XmlElement(name = "CashBackAmount", required = false)
    protected String cashBackAmount;

    @XmlElement(name = "IssuerName", required = false)
    protected String issuerName;

    @XmlElement(name = "TokenExpiration", required = false)
    protected String tokenExpiration;

    @XmlElement(name = "Signature", required = false)
    protected String signature;

    public String getName()
    {
        return FCCResponseTypeEnum.SaleResp.name();
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
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
     * @return the transactionId
     */
    public String getTransactionId()
    {
        return transactionId;
    }

    /**
     * @param transactionId
     *            the transactionId to set
     */
    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
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
     * @return the approvedAmount
     */
    public String getApprovedAmount()
    {
        return approvedAmount;
    }

    /**
     * @param approvedAmount
     *            the approvedAmount to set
     */
    public void setApprovedAmount(String approvedAmount)
    {
        this.approvedAmount = approvedAmount;
    }

    /**
     * @return the approvalCode
     */
    public String getApprovalCode()
    {
        return approvalCode;
    }

    /**
     * @param approvalCode
     *            the approvalCode to set
     */
    public void setApprovalCode(String approvalCode)
    {
        this.approvalCode = approvalCode;
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
     * @return the avsCode
     */
    public String getAvsCode()
    {
        return avsCode;
    }

    /**
     * @param avsCode
     *            the avsCode to set
     */
    public void setAvsCode(String avsCode)
    {
        this.avsCode = avsCode;
    }

    /**
     * @return the cvvCode
     */
    public String getCvvCode()
    {
        return cvvCode;
    }

    /**
     * @param cvvCode
     *            the cvvCode to set
     */
    public void setCvvCode(String cvvCode)
    {
        this.cvvCode = cvvCode;
    }

    /**
     * @return the maskedCardNumber
     */
    public String getMaskedCardNumber()
    {
        return maskedCardNumber;
    }

    /**
     * @param maskedCardNumber
     *            the maskedCardNumber to set
     */
    public void setMaskedCardNumber(String maskedCardNumber)
    {
        this.maskedCardNumber = maskedCardNumber;
    }

    /**
     * @return the token
     */
    public String getToken()
    {
        return token;
    }

    /**
     * @param token
     *            the token to set
     */
    public void setToken(String token)
    {
        this.token = token;
    }

    /**
     * @return the emvAID
     */
    public String getEmvAID()
    {
        return emvAID;
    }

    /**
     * @param emvAID
     *            the emvAID to set
     */
    public void setEmvAID(String emvAID)
    {
        this.emvAID = emvAID;
    }

    /**
     * @return the emvTVR
     */
    public String getEmvTVR()
    {
        return emvTVR;
    }

    /**
     * @param emvTVR
     *            the emvTVR to set
     */
    public void setEmvTVR(String emvTVR)
    {
        this.emvTVR = emvTVR;
    }

    /**
     * @return the emvIAD
     */
    public String getEmvIAD()
    {
        return emvIAD;
    }

    /**
     * @param emvIAD
     *            the emvIAD to set
     */
    public void setEmvIAD(String emvIAD)
    {
        this.emvIAD = emvIAD;
    }

    /**
     * @return the emvTSI
     */
    public String getEmvTSI()
    {
        return emvTSI;
    }

    /**
     * @param emvTSI
     *            the emvTSI to set
     */
    public void setEmvTSI(String emvTSI)
    {
        this.emvTSI = emvTSI;
    }

    /**
     * @return the emvARC
     */
    public String getEmvARC()
    {
        return emvARC;
    }

    /**
     * @param emvARC
     *            the emvARC to set
     */
    public void setEmvARC(String emvARC)
    {
        this.emvARC = emvARC;
    }

    /**
     * @return the chipData
     */
    public String getChipData()
    {
        return chipData;
    }

    /**
     * @param chipData
     *            the chipData to set
     */
    public void setChipData(String chipData)
    {
        this.chipData = chipData;
    }

    /**
     * @return the tag50
     */
    public String getTag50()
    {
        return tag50;
    }

    /**
     * @param tag50
     *            the tag50 to set
     */
    public void setTag50(String tag50)
    {
        this.tag50 = tag50;
    }

    /**
     * @return the tag5F2A
     */
    public String getTag5F2A()
    {
        return tag5F2A;
    }

    /**
     * @param tag5f2a
     *            the tag5F2A to set
     */
    public void setTag5F2A(String tag5f2a)
    {
        tag5F2A = tag5f2a;
    }

    /**
     * @return the tag5F34
     */
    public String getTag5F34()
    {
        return tag5F34;
    }

    /**
     * @param tag5f34
     *            the tag5F34 to set
     */
    public void setTag5F34(String tag5f34)
    {
        tag5F34 = tag5f34;
    }

    /**
     * @return the tag82
     */
    public String getTag82()
    {
        return tag82;
    }

    /**
     * @param tag82
     *            the tag82 to set
     */
    public void setTag82(String tag82)
    {
        this.tag82 = tag82;
    }

    /**
     * @return the tag95
     */
    public String getTag95()
    {
        return tag95;
    }

    /**
     * @param tag95
     *            the tag95 to set
     */
    public void setTag95(String tag95)
    {
        this.tag95 = tag95;
    }

    /**
     * @return the tag9A
     */
    public String getTag9A()
    {
        return tag9A;
    }

    /**
     * @param tag9a
     *            the tag9A to set
     */
    public void setTag9A(String tag9a)
    {
        tag9A = tag9a;
    }

    /**
     * @return the tag9C
     */
    public String getTag9C()
    {
        return tag9C;
    }

    /**
     * @param tag9c
     *            the tag9C to set
     */
    public void setTag9C(String tag9c)
    {
        tag9C = tag9c;
    }

    /**
     * @return the tag9F02
     */
    public String getTag9F02()
    {
        return tag9F02;
    }

    /**
     * @param tag9f02
     *            the tag9F02 to set
     */
    public void setTag9F02(String tag9f02)
    {
        tag9F02 = tag9f02;
    }

    /**
     * @return the tag9F03
     */
    public String getTag9F03()
    {
        return tag9F03;
    }

    /**
     * @param tag9f03
     *            the tag9F03 to set
     */
    public void setTag9F03(String tag9f03)
    {
        tag9F03 = tag9f03;
    }

    /**
     * @return the tag9F07
     */
    public String getTag9F07()
    {
        return tag9F07;
    }

    /**
     * @param tag9f07
     *            the tag9F07 to set
     */
    public void setTag9F07(String tag9f07)
    {
        tag9F07 = tag9f07;
    }

    /**
     * @return the tag9F0D
     */
    public String getTag9F0D()
    {
        return tag9F0D;
    }

    /**
     * @param tag9f0d
     *            the tag9F0D to set
     */
    public void setTag9F0D(String tag9f0d)
    {
        tag9F0D = tag9f0d;
    }

    /**
     * @return the tag9F0E
     */
    public String getTag9F0E()
    {
        return tag9F0E;
    }

    /**
     * @param tag9f0e
     *            the tag9F0E to set
     */
    public void setTag9F0E(String tag9f0e)
    {
        tag9F0E = tag9f0e;
    }

    /**
     * @return the tag9F0F
     */
    public String getTag9F0F()
    {
        return tag9F0F;
    }

    /**
     * @param tag9f0f
     *            the tag9F0F to set
     */
    public void setTag9F0F(String tag9f0f)
    {
        tag9F0F = tag9f0f;
    }

    /**
     * @return the tag9F10
     */
    public String getTag9F10()
    {
        return tag9F10;
    }

    /**
     * @param tag9f10
     *            the tag9F10 to set
     */
    public void setTag9F10(String tag9f10)
    {
        tag9F10 = tag9f10;
    }

    /**
     * @return the tag9F12
     */
    public String getTag9F12()
    {
        return tag9F12;
    }

    /**
     * @param tag9f12
     *            the tag9F12 to set
     */
    public void setTag9F12(String tag9f12)
    {
        tag9F12 = tag9f12;
    }

    /**
     * @return the tag9F1A
     */
    public String getTag9F1A()
    {
        return tag9F1A;
    }

    /**
     * @param tag9f1a
     *            the tag9F1A to set
     */
    public void setTag9F1A(String tag9f1a)
    {
        tag9F1A = tag9f1a;
    }

    /**
     * @return the tag9F26
     */
    public String getTag9F26()
    {
        return tag9F26;
    }

    /**
     * @param tag9f26
     *            the tag9F26 to set
     */
    public void setTag9F26(String tag9f26)
    {
        tag9F26 = tag9f26;
    }

    /**
     * @return the tag9F27
     */
    public String getTag9F27()
    {
        return tag9F27;
    }

    /**
     * @param tag9f27
     *            the tag9F27 to set
     */
    public void setTag9F27(String tag9f27)
    {
        tag9F27 = tag9f27;
    }

    /**
     * @return the tag9F34
     */
    public String getTag9F34()
    {
        return tag9F34;
    }

    /**
     * @param tag9f34
     *            the tag9F34 to set
     */
    public void setTag9F34(String tag9f34)
    {
        tag9F34 = tag9f34;
    }

    /**
     * @return the tag9F36
     */
    public String getTag9F36()
    {
        return tag9F36;
    }

    /**
     * @param tag9f36
     *            the tag9F36 to set
     */
    public void setTag9F36(String tag9f36)
    {
        tag9F36 = tag9f36;
    }

    /**
     * @return the tag9F37
     */
    public String getTag9F37()
    {
        return tag9F37;
    }

    /**
     * @param tag9f37
     *            the tag9F37 to set
     */
    public void setTag9F37(String tag9f37)
    {
        tag9F37 = tag9f37;
    }

    /**
     * @return the cvmMethod
     */
    public String getCvmMethod()
    {
        return cvmMethod;
    }

    /**
     * @param cvmMethod
     *            the cvmMethod to set
     */
    public void setCvmMethod(String cvmMethod)
    {
        this.cvmMethod = cvmMethod;
    }

    /**
     * @return the exchangeRate
     */
    public String getExchangeRate()
    {
        return exchangeRate;
    }

    /**
     * @param exchangeRate
     *            the exchangeRate to set
     */
    public void setExchangeRate(String exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    /**
     * @return the foreignCurrencyAlpha
     */
    public String getForeignCurrencyAlpha()
    {
        return foreignCurrencyAlpha;
    }

    /**
     * @param foreignCurrencyAlpha
     *            the foreignCurrencyAlpha to set
     */
    public void setForeignCurrencyAlpha(String foreignCurrencyAlpha)
    {
        this.foreignCurrencyAlpha = foreignCurrencyAlpha;
    }

    /**
     * @return the foreignAmount
     */
    public String getForeignAmount()
    {
        return foreignAmount;
    }

    /**
     * @param foreignAmount
     *            the foreignAmount to set
     */
    public void setForeignAmount(String foreignAmount)
    {
        this.foreignAmount = foreignAmount;
    }

    /**
     * @return the margin
     */
    public String getMargin()
    {
        return margin;
    }

    /**
     * @param margin
     *            the margin to set
     */
    public void setMargin(String margin)
    {
        this.margin = margin;
    }

    /**
     * @return the cardType
     */
    public String getCardType()
    {
        return cardType;
    }

    /**
     * @param cardType
     *            the cardType to set
     */
    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    /**
     * @return the nameOnCard
     */
    public String getNameOnCard()
    {
        return nameOnCard;
    }

    /**
     * @param nameOnCard
     *            the nameOnCard to set
     */
    public void setNameOnCard(String nameOnCard)
    {
        this.nameOnCard = nameOnCard;
    }

    /**
     * @return the entryMode
     */
    public String getEntryMode()
    {
        return entryMode;
    }

    /**
     * @param entryMode
     *            the entryMode to set
     */
    public void setEntryMode(String entryMode)
    {
        this.entryMode = entryMode;
    }

    /**
     * @return the receiptText
     */
    public String getReceiptText()
    {
        return receiptText;
    }

    /**
     * @param receiptText
     *            the receiptText to set
     */
    public void setReceiptText(String receiptText)
    {
        this.receiptText = receiptText;
    }

    /**
     * @return the pinVerified
     */
    public String getPinVerified()
    {
        return pinVerified;
    }

    /**
     * @param pinVerified
     *            the pinVerified to set
     */
    public void setPinVerified(String pinVerified)
    {
        this.pinVerified = pinVerified;
    }

    /**
     * @return the signatureRequired
     */
    public String getSignatureRequired()
    {
        return signatureRequired;
    }

    /**
     * @param signatureRequired
     *            the signatureRequired to set
     */
    public void setSignatureRequired(String signatureRequired)
    {
        this.signatureRequired = signatureRequired;
    }

    /**
     * @return the dccAccepted
     */
    public String getDccAccepted()
    {
        return dccAccepted;
    }

    /**
     * @param dccAccepted
     *            the dccAccepted to set
     */
    public void setDccAccepted(String dccAccepted)
    {
        this.dccAccepted = dccAccepted;
    }

    /**
     * @return the cashBackAmount
     */
    public String getCashBackAmount()
    {
        return cashBackAmount;
    }

    /**
     * @param cashBackAmount
     *            the cashBackAmount to set
     */
    public void setCashBackAmount(String cashBackAmount)
    {
        this.cashBackAmount = cashBackAmount;
    }

    /**
     * @return the issuerName
     */
    public String getIssuerName()
    {
        return issuerName;
    }

    /**
     * @param issuerName
     *            the issuerName to set
     */
    public void setIssuerName(String issuerName)
    {
        this.issuerName = issuerName;
    }

    /**
     * @return the tokenExpiration
     */
    public String getTokenExpiration()
    {
        return tokenExpiration;
    }

    /**
     * @param tokenExpiration
     *            the tokenExpiration to set
     */
    public void setTokenExpiration(String tokenExpiration)
    {
        this.tokenExpiration = tokenExpiration;
    }

    /**
     * @return the signature
     */
    public String getSignature()
    {
        return signature;
    }

    /**
     * @param signature
     *            the signature to set
     */
    public void setSignature(String signature)
    {
        this.signature = signature;
    }
}