package org.aboy.configfile.yml.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: Person
 * @Description: 根据 @Value 进行赋值
 * @author: zhaoyining1113@126.com
 * @date 2019/3/19 08:38
 * @since JDK 1.8
 */
@Configuration
public class Student {

  @Value("${student.name}")
  private String name;

  @Value("${student.age}")
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}

