package com.example.PARQUEO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ParqueoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParqueoApplication.class, args);
	}
	@Configuration
	public class WebMvcConfig implements WebMvcConfigurer, com.example.PARQUEO.WebMvcConfig {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/static/**")
					.addResourceLocations("classpath:/static/");
		}
	}
}
