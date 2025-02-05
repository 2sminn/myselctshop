package com.sparta.myselectshop.exception;

public class ProductNotFoundException extends RuntimeException{
    // ctrl + O => exception 메서드 바로 생성!!
    public ProductNotFoundException(String message) {
        super(message);
    }
}
