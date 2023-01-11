package com.devfoxstar.api.web

import com.devfoxstar.api.core.ApiCore
import com.devfoxstar.api.domain.ApiDomain
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication (
	scanBasePackageClasses = [ApiCore::class, ApiDomain::class, ApiWeb::class],
	exclude = [DataSourceAutoConfiguration::class,  ErrorMvcAutoConfiguration::class]
)
class ApiApplication

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
