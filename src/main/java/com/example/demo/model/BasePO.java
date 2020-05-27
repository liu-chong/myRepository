package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class BasePO implements Serializable {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * false,1 有效 true,0 已删除
     */
    private Boolean deleted;
}
