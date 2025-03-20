package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/greeting/{name}")
    public String greeting(@PathParam String name) {
        return "<h1>"service.greeting(name) + "</h1>;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "<h1>hello</h1>";
    }
}
