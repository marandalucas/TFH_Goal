package com.bbva.tinfoilhat.goal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("")
public class GoalResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/api/info")
    public String info() {
        return "SUCCESS - The app is running..";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/api/goals")
    public String userGoals() {
        return "This is the goals";
    }
}