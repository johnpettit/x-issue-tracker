package com.xervanik.xissuetracker.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.xervanik.xissuetracker.repositories")
public class JpaConfig {
}
