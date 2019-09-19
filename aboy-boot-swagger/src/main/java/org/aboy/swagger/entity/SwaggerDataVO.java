package org.aboy.swagger.entity;

import io.swagger.annotations.ApiParam;
import java.util.List;

/**
 * @Author: aboy
 * @Date: 2019-09-19 22:45
 * @Description:
 */
public class SwaggerDataVO {

  @ApiParam(name = "id" , value = "id")
  private Long id;
  @ApiParam(name = "name" , value = "名字")
  private String name;
  @ApiParam(hidden = true)
  private List<String> nameList;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getNameList() {
    return nameList;
  }

  public void setNameList(List<String> nameList) {
    this.nameList = nameList;
  }
}
