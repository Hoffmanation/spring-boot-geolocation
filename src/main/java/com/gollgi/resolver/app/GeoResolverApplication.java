package com.gollgi.resolver.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring-Boot java module Initializer Class
 * @author Hoffman
 *
 */
//Declaring a Spring-Boot application Allow us to get Auto-Configuration and Auto-Component-Scanning and more for this java-module
@SpringBootApplication
//Declaring where the Spring-IOC-Container will be scanning for Spring-Beans
@ComponentScan( {"com.gollgi.resolver.service","com.gollgi.resolver.rest"})
//Declaring where the Spring-IOC-Container will be scanning for DB-Entities to be used by JPA/Hibernate ORM System
@EntityScan({ "com.gollgi.resolver.entity" })
//Declaring where the Spring-IOC-Container will be scanning for the DAO-Persistence layer to be used by JPA-Spring Data

//Uncomment for Geolocation caching support via database
//@EnableJpaRepositories({ "com.codeblock.service", "com.codeblock.service.imp" ,"com.codeblock.repository"})
public class GeoResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoResolverApplication.class, args);
	}

}
