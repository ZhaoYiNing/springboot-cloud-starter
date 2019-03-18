package org.aboy.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: helloRest
 * @Description: 与普通control区别，为restControl注解
 * @author: zhaoyining1113@126.com
 * @date 2019/3/18 19:39
 * @since JDK 1.8
 */
@SpringBootApplication()
@RestController
@RequestMapping("/helloRest")
public class HelloRestApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloRestApplication.class);
  }

  @RequestMapping("/helloRestWorld")
  public String helloWorld(){
    return "helloRestWorld";
  }
}
