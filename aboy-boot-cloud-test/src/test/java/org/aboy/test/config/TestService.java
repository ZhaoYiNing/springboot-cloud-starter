package org.aboy.test.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Title: TestService
 * @Description: TODO
 * @author: zhaoyining1113@126.com
 * @date 2019/9/29 9:33
 * @since JDK 1.8
 */
@Component
public class TestService {

    //@Async
    @Async(value = "DataAsync")
    public void syncData() {
        System.out.println("start sync");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end sync");
    }
}
