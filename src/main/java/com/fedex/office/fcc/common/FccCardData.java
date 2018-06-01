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
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
/**
 * @author Anil.Thakur
 */
public class FccCardData implements Serializable
{
    @XmlElement(name = "entryMode", required = true)
    private String entryMode;

    @XmlElement(name = "encrypted", required = true)
    private String encrypted;

    @XmlElement(name = "aid", required = false)
    protected String aid;

    @XmlElement(name = "bin", required = false)
    protected String bin;

    @XmlElement(name = "nameOnCard", required = false)
    protected String nameOnCard;

    @XmlElement(name = "track1Masked", required = false)
    protected String track1Masked;

    @XmlElement(name = "track2Masked", required = false)
    protected String track2Masked;

    @XmlElement(name = "track1", required = true)
    private String track1;

    @XmlElement(name = "track2", required = false)
    protected String track2;

    @XmlElement(name = "track3", required = false)
    protected String track3;

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
     * @return the encrypted
     */
    public String getEncrypted()
    {
        return encrypted;
    }

    /**
     * @param encrypted
     *            the encrypted to set
     */
    public void setEncrypted(String encrypted)
    {
        this.encrypted = encrypted;
    }

    /**
     * @return the aid
     */
    public String getAid()
    {
        return aid;
    }

    /**
     * @param aid
     *            the aid to set
     */
    public void setAid(String aid)
    {
        this.aid = aid;
    }

    /**
     * @return the bin
     */
    public String getBin()
    {
        return bin;
    }

    /**
     * @param bin
     *            the bin to set
     */
    public void setBin(String bin)
    {
        this.bin = bin;
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
     * @return the track1Masked
     */
    public String getTrack1Masked()
    {
        return track1Masked;
    }

    /**
     * @param track1Masked
     *            the track1Masked to set
     */
    public void setTrack1Masked(String track1Masked)
    {
        this.track1Masked = track1Masked;
    }

    /**
     * @return the track2Masked
     */
    public String getTrack2Masked()
    {
        return track2Masked;
    }

    /**
     * @param track2Masked
     *            the track2Masked to set
     */
    public void setTrack2Masked(String track2Masked)
    {
        this.track2Masked = track2Masked;
    }

    /**
     * @return the track1
     */
    public String getTrack1()
    {
        return track1;
    }

    /**
     * @param track1
     *            the track1 to set
     */
    public void setTrack1(String track1)
    {
        this.track1 = track1;
    }

    /**
     * @return the track2
     */
    public String getTrack2()
    {
        return track2;
    }

    /**
     * @param track2
     *            the track2 to set
     */
    public void setTrack2(String track2)
    {
        this.track2 = track2;
    }

    /**
     * @return the track3
     */
    public String getTrack3()
    {
        return track3;
    }

    /**
     * @param track3
     *            the track3 to set
     */
    public void setTrack3(String track3)
    {
        this.track3 = track3;
    }
}