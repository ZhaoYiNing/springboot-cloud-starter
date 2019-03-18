package org.aboy.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: hello
 * @Description: TODO
 * @author: zhaoyining1113@126.com
 * @date 2019/3/18 19:39
 * @since JDK 1.8
 */
@SpringBootApplication()
@Controller
@RequestMapping("/hello")
public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class);
  }

  @ResponseBody
  @RequestMapping("/helloWorld")
  public String helloWorld(){
    return "helloWorld";
  }
}
