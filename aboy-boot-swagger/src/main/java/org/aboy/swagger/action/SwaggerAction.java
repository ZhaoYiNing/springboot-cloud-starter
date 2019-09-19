package org.aboy.swagger.action;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.aboy.swagger.entity.DataResult;
import org.aboy.swagger.entity.SwaggerDataObj;
import org.aboy.swagger.entity.SwaggerDataVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: aboy
 * @Date: 2019-09-19 22:41
 * @Description:
 */
@RestController
@Api(tags = "swagger接口")
@RequestMapping("/swagger")
public class SwaggerAction {

  @GetMapping("/getObj")
  @ApiOperation("获取接口")
  public DataResult<SwaggerDataObj> getObj(SwaggerDataVO dataVO){
    DataResult<SwaggerDataObj> result = new DataResult<>();
    result.setCode("1002");
    SwaggerDataObj dataObj = new SwaggerDataObj();
    dataObj.setAge(10L);
    dataObj.setName("name");
    result.setDataObj(dataObj);
    return result;
  }

  /*@PostMapping("/submit")
  @ApiOperation("获取接口")
  public DataResult<SwaggerDataObj> submitObj(@RequestBody @ApiParam(value = "请求") SwaggerDataVO dataVO){
    DataResult<SwaggerDataObj> result = new DataResult<>();
    result.setCode("1002");
    SwaggerDataObj dataObj = new SwaggerDataObj();
    dataObj.setAge(dataVO.getId());
    dataObj.setName(dataVO.getName());
    result.setDataObj(dataObj);
    return result;
  }*/
}
