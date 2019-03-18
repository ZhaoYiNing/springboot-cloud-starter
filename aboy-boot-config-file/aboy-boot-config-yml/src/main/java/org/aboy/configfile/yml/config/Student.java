package org.aboy.configfile.yml.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {

  @Value("${student.name}")
  private String name;

  @Value("${student.age}")
  private Integer age;
}

