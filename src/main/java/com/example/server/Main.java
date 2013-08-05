package com.example.server;

import com.example.server.bindings.GuiceServletInjector;
import com.google.inject.servlet.GuiceFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler servletContextHandler = new ServletContextHandler(server, "/");
        servletContextHandler.addEventListener(new GuiceServletInjector());
        servletContextHandler.addFilter(GuiceFilter.class, "/*", null);
        servletContextHandler.addServlet(DefaultServlet.class, "/");

        server.start();
        System.out.println("Press any key to stop server...");
        System.in.read();
        System.out.println("Stopping...");
        server.stop();
        server.join();
    }
}
