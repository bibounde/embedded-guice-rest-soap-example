package com.example.server.soap.hello;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.server.soap.hello.HelloFromSoapService",
        serviceName = "Hello",
        targetNamespace = "com.example.server.soap.hello")
public class HelloFromSoapServiceImpl implements HelloFromSoapService {

    @Override
    public String sayHelloFromSoap(final String msg) {
        return "Hello from SOAP: "+msg;
    }
}
