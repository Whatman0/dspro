package com.example.dspro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages = "com.example.dspro")
@EnableJpaRepositories(basePackages = "com.example.userDao")
@SpringBootApplication
@EntityScan(basePackages = "com.example.dspro.entity")
@EnableTransactionManagement
public class DsproApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		
		SpringApplication.run(DsproApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DsproApplication.class);
	}
}
