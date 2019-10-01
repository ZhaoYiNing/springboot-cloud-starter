package org.aboy.es.dao;

import java.util.Calendar;
import java.util.UUID;
import org.aboy.es.entity.Record;
import org.aboy.es.entity.User;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public class RecordRepositoryTest {

    @Autowired
    private EsRecordRepository recordRepository;

    @Test
    public void getRecord(){
        Record record = new Record();
        //record.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setId(1);
        record.setLineNum(1);
        recordRepository.save(record);

        /**
         * 创建查询体
         */
        BoolQueryBuilder builder = QueryBuilders.boolQuery();

        /**
         * 设置聚合条件
         */
        MatchQueryBuilder query = QueryBuilders.matchQuery("id" , "WNqyYW0BLk_plTFeZQjv");

        /**
         * 将聚合条件设置入查询体之中
         */
        builder.must(query);
        Page<Record> list = recordRepository.findAll(PageRequest.of(0, 10));
        Page<Record> list2 = recordRepository.search(query , PageRequest.of(0, 10));

        System.out.println(1);
    }
}
