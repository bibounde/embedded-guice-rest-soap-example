package com.example.server.bindings;

import com.example.server.rest.hello.HelloFromRestService;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class GuiceRestServicesConfigModule extends JerseyServletModule {
    @Override
    protected void configureServlets() {
        bind(HelloFromRestService.class);
        serve("/rest/*").with(GuiceContainer.class);
    }
}
