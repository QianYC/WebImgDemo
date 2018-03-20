package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class DemoApplication {

//	@Bean
//	public ViewResolver viewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("templates/");
//        resolver.setSuffix(".html");
//        resolver.setExposeContextBeansAsAttributes(true);
//        return resolver;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
