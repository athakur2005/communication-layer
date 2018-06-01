/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2017 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Anil.Thakur
 */
public class FccCommonMapping
{
    private final String primaryTag;
    private final Map<String, Class<?>> relationMap;

    public FccCommonMapping(String primaryTag)
    {
        this.primaryTag = primaryTag;
        this.relationMap = new HashMap<String, Class<?>>();
    }

    public String extractType(String xml)
    {
        return extractType(xml, allowedValues());
    }

    public Class<?> getBoundClass(String type)
    {
        return relationMap.get(type);
    }

    public String[] allowedValues()
    {
        return relationMap.keySet().toArray(new String[0]);
    }

    public FccCommonMapping addMappingClass(String name, Class<?> clazz)
    {
        relationMap.put(name, clazz);
        return this;
    }

    private String extractType(String xml, String... allowedValues)
            throws FccJaxbTranslatorException
    {
        Matcher queryMatcher = Pattern.compile(startTag(primaryTag) + "(.*)" + endTag(primaryTag))
                .matcher(xml);
        if (!queryMatcher.find())
        {
            throw new FccJaxbTranslatorException(
                    "Could not find (" + primaryTag + ") tag in " + xml);
        }
        String respType = queryMatcher.group(1);
        for (String allowed : allowedValues)
        {
            if (allowed.equals(respType))
                return allowed;
        }

        throw new FccJaxbTranslatorException(
                respType + " is not supported.  Expected " + Arrays.toString(allowedValues));
    }

    private String startTag(String tag)
    {
        return "<" + tag + ">";
    }

    private String endTag(String tag)
    {
        return "</" + tag + ">";
    }
}