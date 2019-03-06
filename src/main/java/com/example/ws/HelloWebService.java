package com.example.ws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "用户服务")
public interface HelloWebService {
    @WebResult(name = "问候家人")
    String hello(@WebParam(name = "问候") String s);
}
