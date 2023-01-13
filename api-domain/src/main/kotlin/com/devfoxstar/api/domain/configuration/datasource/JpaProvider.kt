package com.devfoxstar.api.domain.configuration.datasource

import com.devfoxstar.api.domain.entity.Entities
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackageClasses = [EnableJpaRepositories::class])
@EntityScan(basePackageClasses = [Entities::class])
class JpaProvider {
}