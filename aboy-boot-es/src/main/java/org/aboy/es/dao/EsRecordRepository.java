package org.aboy.es.dao;

import org.aboy.es.entity.Record;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: EsRecordRepository
 * @Description: es用户
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 15:43
 * @since JDK 1.8
 */
@Repository
public interface EsRecordRepository extends ElasticsearchRepository<Record,String> {

}
