package org.aboy.configfile.prop;


import org.aboy.configfile.prop.config.Person;
import org.aboy.configfile.prop.config.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/hello")
public class ConfigPropApplication {

  public static void main(String[] args) {
    ApplicationContext ac = SpringApplication.run(ConfigPropApplication.class);
    Student student = ac.getBean(Student.class);
    Person person = ac.getBean(Person.class);
    System.out.println(1);
  }

  @RequestMapping("/helloWorld")
  public String helloWorld(){
    return "helloWorld";
  }
}
