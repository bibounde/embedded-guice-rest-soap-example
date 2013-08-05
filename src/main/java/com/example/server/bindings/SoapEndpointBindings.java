package com.example.server.bindings;

import com.example.server.soap.hello.HelloFromSoapService;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;

@Singleton
public class SoapEndpointBindings extends CXFNonSpringServlet {

    private final HelloFromSoapService m_soapService;

    @Inject
    SoapEndpointBindings(final HelloFromSoapService soapService) {
        m_soapService = soapService;
    }

    @Override
    protected void loadBus(final ServletConfig sc) {
        super.loadBus(sc);
        BusFactory.setDefaultBus(getBus());
        Endpoint.publish("/hello", m_soapService);
    }
}
