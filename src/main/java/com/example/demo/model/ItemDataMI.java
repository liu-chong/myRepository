package com.example.demo.model;


import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ItemDataMI extends BasePO implements Serializable {
    /**
     * 题目编码
     */
    private String itemCode;
    /**
     * 题目名称
     */
    private String itemName;

    /**
     * 题目类型，每种类型对应一种APP控件
     */
    private String itemType;

    /**
     * 问题组Id
     */
    private String groupId;

    /**
     * 单选,多选,家属联系方式控件用到的选项内容
     */
    private List<Option> option = new ArrayList<>();

    /**
     * 单选,多选,家属联系方式控件用到的选项内容
     */
    private List<Option> specificOption = new ArrayList<>();

    /**
     * 级联问题选项
     */
    private List<Option> collectionOption = new ArrayList<>();

    /**
     * 是否为通用问题
     */
    private Boolean commonQuestion;

    /**
     * 本题绑定的术语ID
     */
    private String itemBandId;

    /**
     * 本题绑定的术语name
     */
    private String itemBandName;

    /**
     * 概念Id
     */
    private String conceptId;

    /**
     * 本题是否有关联选项
     */
    private Boolean related;

    /**
     * 本题是否允许其他选项
     */
    private Boolean agreeOther;

    /**
     * 本题的前序关联关系
     */
    private List<RelationData> relations = new ArrayList<>();

    /**
     * 通用限制规则
     */
    private Limition limition;

    /**
     * 特殊限制规则
     */
    private Limition specificLimit;

    /**
     * 本题默认填充提示
     */
    private String tip;

    /**
     * 本题相关知识点
     */
    private String acknowledge;

    /**
     * 本题相关知识点
     */
    private Boolean mustWrite;

    /**
     * 本题相关知识点
     */
    private Boolean important;

    /**
     * 本题的子题题集
     */
    private List<ItemDataMI> nextItems;

    /**
     * 是否为计算点位
     */
    private Boolean calculate;

    /**
     * 表达式
     */
    private String expression;

    /**
     * 问题组Id
     */
    private String groupName;

    /**
     * 问题组类型（1为普通问题组，2位级联问题组）
     */
    private String groupType;
}

