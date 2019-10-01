package org.aboy.es.dao;

import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.aboy.es.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title: UserRepositoryTest
 * @Description: 用户资源测试类
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 15:45
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private EsUserRepository userRepository;

    @Test
    public void addUser(){
        Calendar calendar = Calendar.getInstance();
        User user = new User();
        //user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setId(1);
        user.setUserName("zhao" + 1);
        user.setPassword("haha" + 1);
        user.setTime("2019-11-12 00:00:0" + 1);
        user.setCreateTime(calendar.getTime());
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        userRepository.save(user);
    }

    @Test
    public void getUser(){
        User user = new User();
        Page<User> list = userRepository.findAll(PageRequest.of(0, 10));
        System.out.println(1);
    }
}
