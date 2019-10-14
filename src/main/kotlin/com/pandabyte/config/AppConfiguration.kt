package com.pandabyte.config

import com.fasterxml.jackson.annotation.JsonProperty

class AppConfiguration {
    @JsonProperty("name")
    lateinit var name: String
}