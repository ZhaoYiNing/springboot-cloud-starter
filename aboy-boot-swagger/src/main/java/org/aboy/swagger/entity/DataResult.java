package org.aboy.swagger.entity;

/**
 * @Author: aboy
 * @Date: 2019-09-19 22:43
 * @Description:
 */
public class DataResult<T> {


  private String code;

  private T dataObj;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public T getDataObj() {
    return dataObj;
  }

  public void setDataObj(T dataObj) {
    this.dataObj = dataObj;
  }
}
