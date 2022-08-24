package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "my")
@ConstructorBinding
data class AppConfig(
    val appUrl: String,
)