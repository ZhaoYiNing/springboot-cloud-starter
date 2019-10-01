package org.aboy.es.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Title: User
 * @Description: 用户实体类
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 10:09
 * @since JDK 1.8
 */
@Document(indexName = "user" , type = "user")
public class User {

    private Integer id;

    private String userName;

    private String password;

    private String time;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
