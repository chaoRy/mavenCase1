package com.chaory.service;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public class ServiceException extends Exception{
    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
