/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Oliver
 */
@Path("quote")
public class quoteREST {
    
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of quoteREST
     */
    public quoteREST() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        String json = gson.toJson("use url: \"./api/quote/(id)\" - ids: 1, 2 or 3");
        return Response.ok(json).build();
    }

    @Path("1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuote1() {
        String json = gson.toJson("Quote: This is quote 1");
        return Response.ok(json).build();
    }

    @Path("2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuote2() {
        String json = gson.toJson("Quote: This is a quote 2");
        return Response.ok(json).build();
    }

    @Path("3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuote3() {
        String json = gson.toJson("Quote: This is a quote 3");
        return Response.ok(json).build();
    }
}
