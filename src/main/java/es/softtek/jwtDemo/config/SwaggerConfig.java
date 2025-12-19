package es.softtek.jwtDemo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement; // 新增
import io.swagger.v3.oas.models.security.SecurityScheme;      // 新增
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // 1. 定义认证方式 (Bearer Token / JWT)
                .components(new Components()
                        .addSecuritySchemes("bearer-key", // 方案名称，随意起
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP) // 类型是 HTTP
                                        .scheme("bearer")               // 方案是 bearer
                                        .bearerFormat("JWT")))          // 格式是 JWT
                // 2. 将该认证方式应用到全局 (所有接口都会出现锁头)
                .addSecurityItem(new SecurityRequirement().addList("bearer-key"))

                // 3. 原有的 Info 配置
                .info(new Info().title("Ejemplo Usuarios")
                        .description("Ejemplo de Microservicos Usuarios")
                        .contact(new Contact()
                                .name("Juan")
                                .email("juan@juan.com")
                                .url("https://juan.com"))
                        .version("1.0"));
    }
}