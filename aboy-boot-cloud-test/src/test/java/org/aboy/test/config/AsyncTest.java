package org.aboy.test.config;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title: AlarmServiceTest
 * @Description: 报警服务测试
 * @author: zhaoyining1113@126.com
 * @date 2019/8/23 14:05
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTest {

    @Autowired
    private ThreadAsyncConfigurer configurer;

    @Autowired
    private TestService testService;

    @Test
    public void sync(){
        System.out.println("start");
        testService.syncData();
        System.out.println("end");
    }
}
