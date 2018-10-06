package com.example.configpropertiesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class ConfigPropertiesDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
	}
}
