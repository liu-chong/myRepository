package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class TemplateTier {
    /**
     * 分类id
     * */
    private String id;
    /**
     * 分类name
     * */
    private String name;

    /**
     * 旧的分类name
     * */
    private String oldName;
    /**
     * 统计排序
     * */
    private Integer sort;

    /**
     * 模板id
     * */
    private String templateId;
    /**
     * 上层id
     * */
    private String fatherId;
    /**
     * 上层name
     * */
    private String fatherName;
    /**
     * 绑定的表单id
     * */
    private List<String> bandFormIds;
    /**
     *  绑定的表单name
     * */
    private List<String> bandFormNames;
}
