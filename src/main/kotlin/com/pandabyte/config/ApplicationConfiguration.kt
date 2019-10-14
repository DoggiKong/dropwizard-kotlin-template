package com.pandabyte.config

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

class ApplicationConfiguration: Configuration() {
    @JsonProperty("app")
    lateinit var app: AppConfiguration
}