package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@SpringBootApplication
@EnableSwagger2 //Enable swagger 2.0 spec
@ComponentScan(basePackageClasses = {
        HomeController.class,
        APIDemoController.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public Docket echoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("echo-api")
                .apiInfo(apiInfo())
                .select()
                	.apis(RequestHandlerSelectors.basePackage("com.example"))
                	.build();
//                .paths(echoPaths())
//                .build();
    }
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("echo demo API")
                .description("Lorem Ipsum is simply dummy text of the printing and typesetting industry")
                .termsOfServiceUrl("http://springfox.io")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
	
	
	private Predicate<String> echoPaths() {
		
		return regex("/echo.*");
		
//        return or(
//                regex("/echo.*")
//        );
    }
}
