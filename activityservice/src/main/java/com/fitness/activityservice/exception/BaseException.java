package com.fitness.activityservice.exception;

import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException{
    private final HttpStatus status;

    protected  BaseException(String message, HttpStatus status){
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus(){
        return status;
    }
}
