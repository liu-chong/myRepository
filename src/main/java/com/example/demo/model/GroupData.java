package com.example.demo.model;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.ArrayList;
import java.util.List;


@Data
@NoRepositoryBean
public class GroupData extends BasePO {
    /**
     * 问题组名称
     */
    private String groupName;

    /**
     * 组名是否显示
     * */
    private String nameState;

    /**
     * 支持患者填写
     * */
    private String supportWrite;

    /**
     * 问题组类型（1为普通问题组，2为级联问题组）
     * */
    private String groupType;

    /**
     * 问题组排序
     * */
    private Integer sort;
    /**
     * 是否为通用问题组
     * */
    private Boolean common;
    /**
     * 问题组说明
     * */
    private String groupMemo;
    /**
     * 本问题组的前序关联关系
     */
    private List<RelationData> relations = new ArrayList<>();

    /**
     * 组内问题列表
     * */
    private List<ItemData> items= new ArrayList<>();
}
