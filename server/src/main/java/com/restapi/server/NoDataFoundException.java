package com.restapi.server;

public class NoDataFoundException  extends RuntimeException{

    public  NoDataFoundException(String message) {
        super(message);
    }
}

