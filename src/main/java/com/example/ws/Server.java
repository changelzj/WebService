package com.example.ws;

import org.apache.cxf.frontend.ServerFactoryBean;

public class Server {
    /**
     *
     * 无需注解就能发布，但不支持注解，不支持拦截器
     */
    public static void main(String[] args) {
        HelloWebService service = new HelloWebServiceImpl();
        ServerFactoryBean factoryBean = new ServerFactoryBean();
        factoryBean.setAddress("http://127.0.0.1:8712/ws/user");
        factoryBean.setServiceClass(HelloWebService.class);
        factoryBean.setServiceBean(service);
        factoryBean.create();

    }



}
