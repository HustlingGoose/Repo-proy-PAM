package com.proyectofinal.API_RE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiReApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiReApplication.class, args);
	}
        
        @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:8100","https://segundo-intento-pam.azurewebsites.net")
                    .allowCredentials(true)
                    .allowedHeaders("Origin","Authorization", "Content-Type")
                    .allowedMethods("GET","POST","PUT","DELETE");
            }
            };
        
        }

}
