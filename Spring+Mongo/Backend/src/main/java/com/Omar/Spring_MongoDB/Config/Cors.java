package com.Omar.Spring_MongoDB.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/post") // Ajouter le chemin utilisé pour les requêtes POST
						.allowedOrigins("http://localhost:3000")
						.allowedMethods("POST")
						.allowedHeaders("Content-Type", "Authorization");

				registry.addMapping("/Posts") // Ajouter le chemin utilisé pour les requêtes GET
						.allowedOrigins("http://localhost:3000")
						.allowedMethods("GET")
						.allowedHeaders("Content-Type", "Authorization");

				registry.addMapping("/Posts/{text}") // Ajouter le chemin utilisé pour les requêtes GET avec paramètres
						.allowedOrigins("http://localhost:3000")
						.allowedMethods("GET")
						.allowedHeaders("Content-Type", "Authorization");
			}
		};
	}
}
