package com.spring.boot.swager.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public Docket productAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.spring"))
				.build()
				.apiInfo(getMetaInfo());
	}

	private ApiInfo getMetaInfo() {
		ApiInfo apiInfo = new ApiInfo("Swagger Demo", "Spring Boot Using Swagger Documentation", "1.0",
				"Terms Of Service", "Pravee.konchada@gmail.com", "copyrights@2019",
				"http://localhost:8080/swagger-ui.html");
		return apiInfo;
	}

}
