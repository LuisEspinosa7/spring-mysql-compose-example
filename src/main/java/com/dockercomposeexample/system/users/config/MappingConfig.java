//Copyright 2024 Luis Hernan Espinosa
package com.dockercomposeexample.system.users.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Class MappingConfig.
 * 
 * @author luishernan.espinosa
 */
@Configuration
public class MappingConfig {
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
