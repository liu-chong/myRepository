package com.example.demo.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class SampleItemData implements Serializable {
    /**
     * 题目编码
     */
    private String id;

    /**
     * 题目名称
     */
    private String itemName;

    /**
     *
     */
    private String itemCode;

    /**
     * 父题目id（父级itemCode）
     */
    private String parentId;

    /**
     * 问题组id
     */
    private String groupId;

    /**
     * 备注
     */
    private String remark;

}


