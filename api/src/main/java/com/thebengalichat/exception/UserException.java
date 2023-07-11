package com.thebengalichat.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

public class UserException extends Exception{

    public UserException(String message){
        super(message);
    }
}
