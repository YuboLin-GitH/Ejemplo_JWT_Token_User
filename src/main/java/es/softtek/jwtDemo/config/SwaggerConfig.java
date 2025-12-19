package es.softtek.jwtDemo.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()

                .info(new Info().title("Ejemplo Usuarios")
                        .description("Ejemplo de Microservicos Usuarios")
                        .contact(new Contact()
                                .name("Juan")
                                .email("juan@juan.com")
                                .url("https://juan.com"))
                        .version("1.0"));
    }
}