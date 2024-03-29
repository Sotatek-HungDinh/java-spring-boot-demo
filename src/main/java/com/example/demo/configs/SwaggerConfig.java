// package com.example.demo.configs;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.*;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// import java.util.Collections;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {

//   @Bean
//   public Docket api() {
//     return new Docket(DocumentationType.SWAGGER_2)
//         .apiInfo(apiInfo())
//         .select()
//         .apis(RequestHandlerSelectors.any())
//         .paths(PathSelectors.any())
//         .build();
//   }

//   private ApiInfo apiInfo() {
//     return new ApiInfo(
//         "Mange Student",
//         "Some custom description of API.",
//         "1.0",
//         "Terms of service",
//         new Contact("PVD", "https://facebook.com/dinh1007", "phamvandinh@gmail.com"),
//         "License of API",
//         "https://facebook.com/dinh1007",
//         Collections.emptyList());
//   }
// }
