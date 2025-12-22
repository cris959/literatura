package com.alura.literatura.exception;

public class DataConversionException extends RuntimeException{

    public DataConversionException(String message, Throwable cause){
        super(message, cause);
    }
}
