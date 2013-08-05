package com.example.server.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloFromRestService {

    @GET
    @Path("/{msg}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloFromRest(final @PathParam("msg") String msg) {
        return "Hello from REST: "+msg;
    }
}
