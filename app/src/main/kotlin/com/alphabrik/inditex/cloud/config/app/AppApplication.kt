package com.alphabrik.inditex.cloud.config.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class AppApplication

fun main(args: Array<String>) {
    runApplication<AppApplication>(*args)
}
