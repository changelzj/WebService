package com.example.ws;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server2 {

    /**
     * 需要注解，不加注解不能暴漏任何方法
     * 该类生成的wsdl文档更加规范
     * 能添加拦截器
     *
     * 另：webservice访问流程：
     * 第一步.检测本地代理描述的wsdl是否与服务端的一致：握手
     * 第二步 通过soap协议实现通信，采用post请求，数据封装在满足soap协议的xml中
     * 第三布 服务端返回，数据也封装在满足soap协议的xml中
     *
     */
    public static void main(String[] args) {
        HelloWebService helloWebService = new HelloWebServiceImpl();
        JaxWsServerFactoryBean service = new JaxWsServerFactoryBean();
        service.setAddress("http://127.0.0.1:8712/ws/user");
        service.setServiceClass(HelloWebService.class);
        service.setServiceBean(helloWebService);
        //添加输入拦截器
        service.getInInterceptors().add(new LoggingInInterceptor());
        service.getOutInterceptors().add(new LoggingOutInterceptor());
        service.create();
    }
}



