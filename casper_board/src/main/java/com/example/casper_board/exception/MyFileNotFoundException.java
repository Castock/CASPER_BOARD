package com.example.casper_board.exception;

public class MyFileNotFoundException extends RuntimeException{
    public MyFileNotFoundException(String message){
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
