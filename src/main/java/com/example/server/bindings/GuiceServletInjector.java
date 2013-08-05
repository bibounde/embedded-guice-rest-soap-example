package com.example.server.bindings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceServletInjector extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new GuiceManagedDependenciesModule(),
                new GuiceRestServicesConfigModule(),
                new GuiceSoapServicesConfigModule());
    }
}
