package org.aboy.mongodb.dao;

import java.util.Calendar;
import java.util.Collections;
import java.util.UUID;
import org.aboy.mongodb.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title: UserTest
 * @Description: 用户测试类
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 10:11
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private MongodbUserRepository userRepository;

    @Test
    public void addUser() {
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            user.setUserName("zhao" + i);
            user.setPassword("haha" + i);
            user.setTime("2019-11-12 00:00:0" + i);
            user.setCreateTime(calendar.getTime());
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            userRepository.save(user);
        }

    }

    @Test
    public void findUser() {
        User user = new User();
        user.setUserName("zhao");
        Page<User> list = userRepository
            .findAll(Example.of(user, ExampleMatcher.matching().withMatcher("userName",
                GenericPropertyMatchers.startsWith())),
                PageRequest.of(1, 2, Sort.by(Direction.DESC, "time")));
        System.out.println();
    }

    @Test
    public void deleteUser(){
        User user = new User();
        user.setId("f3778731df714055bf462e41360b5aa9");
        user.setUserName("zhao");
        userRepository.deleteAll(Collections.singleton(user));

    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId("664e65c01a0f49b6ae8c87c5c2060b13");
        user.setUserName("zz");
        userRepository.save(user);
    }

}
