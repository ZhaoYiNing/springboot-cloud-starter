package org.aboy.es.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Title: Record
 * @Description: 记录名称
 * @author: zhaoyining1113@126.com
 * @date 2019/10/1 16:45
 * @since JDK 1.8
 */
@Document(indexName = "record-test" , type = "doc")
public class Record {

    @Field(type = FieldType.Auto)
    private String id;

    @Field(searchAnalyzer="LineNum",analyzer="LineNum",type= FieldType.Integer)
    private Integer lineNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }
}
