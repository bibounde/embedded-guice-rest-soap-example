package com.example.server.soap.hello;

import javax.jws.WebService;

@WebService
public interface HelloFromSoapService {
    String sayHelloFromSoap(final String msg);
}
