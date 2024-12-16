package com.dockercomposeexample.system.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.dockercomposeexample.system" })
@EntityScan(basePackages = { "com.dockercomposeexample.system" })
@SpringBootApplication(scanBasePackages = "com.dockercomposeexample.system")
public class SpringMysqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlExampleApplication.class, args);
	}

}
