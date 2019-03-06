package com.example.ws;

public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String hello(String s) {
        return "hello " + s;
    }
}
