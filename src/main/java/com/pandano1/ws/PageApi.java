package com.pandano1.ws;

import com.pandano1.examples.Car;
import com.pandano1.ws.pojo.Page;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("page/v0/")
public class PageApi {
    @Path("{pageId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPage(@PathParam("pageId")  String pageId, @DefaultValue("all") @QueryParam("mode") String mode){
        return Response.
                status(Response.Status.OK).
                entity(new Page().setContent("hello").setTitle("title").setId("fmdkfmdkf").setOwner("ded")).
                build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("")
    public Response postPage(@DefaultValue("Ankita") @QueryParam("user") String user, Page page){
        System.out.println(page);
        System.out.println(user);
        page.setOwner(user);
        page.setId(UUID.randomUUID().toString());
        return Response.
                status(Response.Status.CREATED).
                entity(page).
                build();

    }


}
