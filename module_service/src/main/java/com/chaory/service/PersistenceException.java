package com.chaory.service;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public class PersistenceException extends Exception {
    public PersistenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PersistenceException() {
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
