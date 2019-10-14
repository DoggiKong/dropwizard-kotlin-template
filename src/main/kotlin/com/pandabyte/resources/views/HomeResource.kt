package com.pandabyte.resources.views

import com.pandabyte.views.HomeView
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
@Produces(MediaType.TEXT_HTML)
class HomeResource {

    @GET
    fun getHomeIndexView(): HomeView {
        return HomeView()
    }
}
