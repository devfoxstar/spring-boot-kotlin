package com.devfoxstar.api.domain.configuration.datasource

import com.devfoxstar.api.domain.configuration.property.MariaDbProperty
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class MariaDbProvider {

    @Autowired
    lateinit var mariaDbProperty: MariaDbProperty

    @Bean(name = ["mariaDbDataSource"])
    fun mariaDbDataSource() : DataSource {
        return DataSourceBuilder.create()
            .driverClassName(mariaDbProperty.driver)
            .url(mariaDbProperty.url)
            .username(mariaDbProperty.username)
            .password(mariaDbProperty.password)
            .type(HikariDataSource::class.java)
            .build()
    }

}