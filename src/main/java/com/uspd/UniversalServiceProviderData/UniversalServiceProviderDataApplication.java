package com.uspd.UniversalServiceProviderData;

import com.uspd.UniversalServiceProviderData.exception.GlobalExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;

@SpringBootApplication
public class UniversalServiceProviderDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversalServiceProviderDataApplication.class, args);
	}

	@Bean
	public HandlerExceptionResolver globalExceptionHandler() {
		return (HandlerExceptionResolver) new GlobalExceptionHandler();
	}
}
