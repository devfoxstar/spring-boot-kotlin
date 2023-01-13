package com.devfoxstar.api.domain.configuration.property

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.core.annotation.Order
import org.springframework.core.io.ClassPathResource

@Configuration
@Order(value = Int.MIN_VALUE)
class PropertyProvider {

    @Bean
    @Profile("local")
    fun getLocalProperties() : PropertySourcesPlaceholderConfigurer {
        val configurer = PropertySourcesPlaceholderConfigurer()
        val yaml = YamlPropertiesFactoryBean()

        yaml.setResources(ClassPathResource("application-domain-local.yml"))
        configurer.setProperties(yaml.`object`!!)

        return configurer
    }

}