package com.example.server.bindings;

import com.example.server.soap.hello.HelloFromSoapService;
import com.example.server.soap.hello.HelloFromSoapServiceImpl;
import com.google.inject.servlet.ServletModule;

public class GuiceSoapServicesConfigModule extends ServletModule {
    @Override
    protected void configureServlets() {
        bind(HelloFromSoapService.class).to(HelloFromSoapServiceImpl.class);
        serve("/soap/*").with(SoapEndpointBindings.class);
    }
}
