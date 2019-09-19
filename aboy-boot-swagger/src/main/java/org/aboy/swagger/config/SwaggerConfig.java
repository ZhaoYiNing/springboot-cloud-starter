package org.aboy.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: aboy
 * @Date: 2019-09-19 22:37
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .pathMapping("/")
        .select()
        .apis(RequestHandlerSelectors.basePackage("org.aboy.swagger.action"))
        .paths(PathSelectors.any())
        .build().apiInfo(new ApiInfoBuilder()
            .title("SpringBoot整合Swagger")
            .description("SpringBoot整合Swagger，详细信息......")
            .version("9.0")
            .contact(new Contact("aboy","blog.csdn.net","zhaoyining1113@126.com"))
            .license("The Apache License")
            .licenseUrl("http://www.baidu.com")
            .build());
  }
}
