package com.spdata.site;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spdata.site.factory.ModelMapperFactory;

@SpringBootApplication
public class SpdataSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpdataSiteApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapperFactory().getModelMapper();
	}

}
