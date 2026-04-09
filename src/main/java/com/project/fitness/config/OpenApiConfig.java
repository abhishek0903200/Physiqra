package com.project.fitness.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Fitness Traacking API")
                        .version("1.0")
                        .description("Production Grade API's")
                        .contact(new Contact()
                                .name("Abhishek")
                                .url("https://abhishek0903200.github.io/portfolio/")
                                .email("abhishekmaaurya09@gmail.com")
                        ));
    }
}
