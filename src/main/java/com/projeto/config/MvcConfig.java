package com.projeto.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

	@Configuration
	public class MvcConfig implements WebMvcConfigurer {

	    public void addViewControllers(ViewControllerRegistry registry) {
	    	registry.addViewController("/home.html").setViewName("home");
	        registry.addViewController("/login").setViewName("login");
	        registry.addViewController("/curriculo.html").setViewName("curriculo");
	        registry.addViewController("/curso.html").setViewName("curso");
	        registry.addViewController("/guia.html").setViewName("guia");
	   
	    }

	}


