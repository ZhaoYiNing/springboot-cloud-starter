package org.aboy.swagger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ConfigYmlApplication
 * @Description: 配置文件启动类
 * @author: zhaoyining1113@126.com
 * @date 2019/3/18 19:52
 * @since JDK 1.8
 */
@SpringBootApplication()
@RestController
public class SwaggerApplication {

  public static void main(String[] args) {
    ApplicationContext ac = SpringApplication.run(SwaggerApplication.class);
  }

}
