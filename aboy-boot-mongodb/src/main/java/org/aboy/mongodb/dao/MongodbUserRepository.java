package org.aboy.mongodb.dao;

import org.aboy.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: MongodbRepository
 * @Description: Mongodb资源库
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 10:08
 * @since JDK 1.8
 */
@Repository
public interface MongodbUserRepository extends MongoRepository<User,String> {

}
