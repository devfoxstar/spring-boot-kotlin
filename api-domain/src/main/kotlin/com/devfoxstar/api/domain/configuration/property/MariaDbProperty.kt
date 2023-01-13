package com.devfoxstar.api.domain.configuration.property

import org.apache.logging.log4j.util.Strings
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "spring.datasource.mariadb")
class MariaDbProperty {

    var driver: String = Strings.EMPTY
    var url: String = Strings.EMPTY
    var username: String = Strings.EMPTY
    var password: String = Strings.EMPTY

}