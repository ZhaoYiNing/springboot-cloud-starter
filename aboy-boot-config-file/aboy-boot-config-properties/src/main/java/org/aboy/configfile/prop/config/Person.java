package org.aboy.configfile.prop.config;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Title: Person
 * @Description: 根据 prefix 进行赋值
 * @author: zhaoyining1113@126.com
 * @date 2019/3/19 08:38
 * @since JDK 1.8
 */
@Configuration
@ConfigurationProperties(prefix = "person")
public class Person {

  private String name;

  private Integer age;

  private Map<String , String> course;

  private Map<String , String> say;

  private List<String> fruits;

  private List<Skill> skillList;

  public List<Skill> getSkillList() {
    return skillList;
  }

  public void setSkillList(List<Skill> skillList) {
    this.skillList = skillList;
  }

  public List<String> getFruits() {
    return fruits;
  }

  public void setFruits(List<String> fruits) {
    this.fruits = fruits;
  }

  public Map<String, String> getSay() {
    return say;
  }

  public void setSay(Map<String, String> say) {
    this.say = say;
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
