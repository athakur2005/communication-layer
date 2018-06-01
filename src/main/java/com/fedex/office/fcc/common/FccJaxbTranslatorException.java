/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2018 Fedex Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

package com.fedex.office.fcc.common;

/**
 * @author Anil.Thakur
 */
public final class FccJaxbTranslatorException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public FccJaxbTranslatorException()
    {
        super();
    }

    public FccJaxbTranslatorException(String message)
    {
        super(message);
    }

    public FccJaxbTranslatorException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public FccJaxbTranslatorException(Throwable cause)
    {
        super(cause);
    }
}
