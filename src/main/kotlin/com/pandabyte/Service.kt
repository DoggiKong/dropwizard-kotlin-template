package com.pandabyte

import com.pandabyte.config.ApplicationConfiguration
import com.pandabyte.resources.views.HomeResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.dropwizard.views.ViewBundle

class Service: Application<ApplicationConfiguration>() {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Service().run(*args)
        }
    }

    override fun run(configuration: ApplicationConfiguration?, environment: Environment?) {
        environment!!.jersey().register(HomeResource())
    }

    override fun initialize(bootstrap: Bootstrap<ApplicationConfiguration>) {
        bootstrap.addBundle(ViewBundle<ApplicationConfiguration>())
    }
}
