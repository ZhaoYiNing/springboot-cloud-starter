package org.aboy.swagger.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: aboy
 * @Date: 2019-09-19 22:44
 * @Description:
 */
public class SwaggerDataObj {

  @ApiModelProperty(value = "名字")
  private String name;

  @ApiModelProperty(value = "年龄")
  private Long age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }
}
