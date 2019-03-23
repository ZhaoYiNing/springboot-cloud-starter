package org.aboy.configfile.prop.config;


import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Title: Person
 * @Description: 根据 @Value 进行赋值
 * @author: zhaoyining1113@126.com
 * @date 2019/3/19 08:38
 * @since JDK 1.8
 */
@Configuration
@ConfigurationProperties
//@PropertySource(value = "classpath:config/application.properties")
public class Student {

  @Value("${student.name}")
  private String name;

  @Value("${student.age}")
  private Integer age;
  /**
   * 课程
   */
  @Value("#{${student.course}}")
  private Map<String , String> course;

  @Value("#{'${student.fruits}'.split(',')}")
  private List<String> fruits;

  public List<String> getFruits() {
    return fruits;
  }

  public void setFruits(List<String> fruits) {
    this.fruits = fruits;
  }

  public Map<String, String> getCourse() {
    return course;
  }

  public void setCourse(Map<String, String> course) {
    this.course = course;
  }

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

