package org.aboy.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Title: TestApplication
 * @Description: 测试应用启动类
 * @author: zhaoyining1113@126.com
 * @date 2019/9/29 9:23
 * @since JDK 1.8
 */
@SpringBootApplication
//@EnableAsync
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
