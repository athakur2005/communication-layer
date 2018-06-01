/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

/**
 * @author Anil.Thakur
 */
public class FccXmlFormatter
{

    final static Logger logger = Logger.getLogger(FccXmlFormatter.class);

    /**
     * Return formatted XML
     * 
     * @param unformattedXml
     * @return
     */
    public String format(String unformattedXml)
    {
        try
        {
            Document document = parseXmlFile(unformattedXml);

            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(100);
            format.setIndenting(true);
            format.setIndent(4);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);

            return out.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return "";
        }

    }

    /**
     * This function converts String XML to Document object
     * 
     * @param in
     *            - XML String
     * @return Document object
     */
    private Document parseXmlFile(String in)
    {
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            return db.parse(is);
        }
        catch (ParserConfigurationException pce)
        {
            logger.info("Excecption occured inside parseXmlFile()->" + pce);
        }
        catch (SAXException saxe)
        {
            logger.info("Excecption occured inside parseXmlFile()->" + saxe);
        }
        catch (IOException ioe)
        {
            logger.info("Excecption occured inside parseXmlFile()->" + ioe);
        }
        return null;
    }
}