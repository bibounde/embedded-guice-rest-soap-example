package com.example.server.bindings;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class GuiceManagedDependenciesModule extends AbstractModule {
    @Override
    protected void configure() {
        // dependency bindings for classes to be injected to both soap and rest services configured here
    }
}
