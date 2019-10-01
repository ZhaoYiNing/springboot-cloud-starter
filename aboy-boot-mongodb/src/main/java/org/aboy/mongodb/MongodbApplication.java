package org.aboy.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: TestApplication
 * @Description: 测试应用启动类
 * @author: zhaoyining1113@126.com
 * @date 2019/9/29 9:23
 * @since JDK 1.8
 */
@SpringBootApplication
public class MongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }
}
