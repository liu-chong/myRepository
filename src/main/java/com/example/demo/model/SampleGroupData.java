package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
public class SampleGroupData {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 问题组名称
     */
    private String groupName;

    /**
     * 问题组类型（1为普通问题组，2为级联问题组）
     * */
    private String groupType;

    /**
     * 问题组排序
     * */
    private Integer sort;


    private String nameState;

    /**
     * 支持患者填写
     * */
    private String supportWrite;

    /**
     * 组内问题列表
     * */
    private List<SampleItemData> itemList= new ArrayList<>();
}

