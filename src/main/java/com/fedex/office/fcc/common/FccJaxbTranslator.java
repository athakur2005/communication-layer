/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 * @author Anil.Thakur
 */
public class FccJaxbTranslator
{

    private static final FccCommonMapping requestClassesMapping = new FccRequestClassesMapping();
    private static final FccCommonMapping responseClassesMapping = new FccResponseClassesMapping();

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    public String toRequestXml(FccNamed request) throws JAXBException
    {
        return toXml(request, requestClassesMapping.getBoundClass(request.getName()));
    }

    /**
     * @param xml
     * @return
     * @throws JAXBException
     */
    public Object toRequestObject(String xml) throws JAXBException
    {
        String requestType = requestClassesMapping.extractType(xml);
        return toObject(xml, requestClassesMapping.getBoundClass(requestType));
    }

    /**
     * @param request
     * @return
     * @throws JAXBException
     */
    public String toResponseXml(FccNamed request) throws JAXBException
    {
        return toXml(request, responseClassesMapping.getBoundClass(request.getName()));
    }

    /**
     * @param xml
     * @param type
     * @return
     * @throws JAXBException
     */
    public Object toResponseObject(String xml, String type) throws JAXBException
    {
        // If below commented code is to be used, we have to identify some unique
        // element
        // in the response which
        // String type = responseClassesMapping.extractType(xml);
        return toObject(xml, responseClassesMapping.getBoundClass(type));
    }

    /**
     * @param object
     * @param factoryClasses
     * @return
     * @throws JAXBException
     */
    private String toXml(FccNamed object, Class<?>... factoryClasses) throws JAXBException
    {
        JAXBContext ctx = JAXBContext.newInstance(factoryClasses);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

        StringWriter writer = new StringWriter();
        marshaller.marshal(object, writer);

        return writer.toString();
    }

    /**
     * @param xml
     * @param factoryClasses
     * @return
     * @throws JAXBException
     */
    private Object toObject(String xml, Class<?>... factoryClasses) throws JAXBException
    {
        JAXBContext ctx = JAXBContext.newInstance(factoryClasses);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        if (xml == null)
        {
            return null;
        }
        else
        {
            return unmarshaller.unmarshal(new StreamSource(new StringReader(xml)));
        }
    }
}