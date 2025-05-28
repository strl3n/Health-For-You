package com.istts.healthforyou

import java.io.Serializable

data class EntityUser (
    val username: String,
    val email: String,
    var password: String,
    var display_name: String,
    var role: String,
): Serializable