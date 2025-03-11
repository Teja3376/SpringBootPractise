package com.st33.teja.daoLayer;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String msg){
        super(msg);
    }

    public ProductNotFoundException(String msg,Throwable p){
        super(msg,p);
    }
}