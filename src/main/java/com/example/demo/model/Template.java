package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Data
public class Template extends BasePO{

    /**
     * 模板类别编码
     */
    private String templateCode;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 模板标识(算法训练)
     */
    private String templateTag;

    /**
     * 模板标识id(正式1、测试2)
     */
    private String templateTagId;

    /**
     * 模板类型  团队、多中心、患者管理
     */
    private String templateType;

    /**
     * 模板应用范围（通用、定制）
     */
    private String templateScope;

    /**
     * 表单数量
     */
    private Integer formCount;
    /**
     * 问题数量
     */
    private Integer questionCount;
    /**
     * 适用疾病
     */
    private List<Illness> forIllness = new ArrayList();
    /**
     * 模板使用团队
     */
    private List<Group> usage = new ArrayList<>();
    /**
     * 模板版本
     */
    private Double version;
    /**
     * 模板绑定的表单
     */
    private LinkedHashMap<String, String> formList = new LinkedHashMap<>();
    /**
     * 模板发布状态 1：已发布  2：未发布 3：已升级
     */
    private String releaseState;
    /**
     * 模板编辑状态 1：无效  2：有效  3：锁定
     */
    private String editState;
    /**
     * 模板说明（备注）
     */
    private String memo;

    private Integer verifyUpgradeStatus;

    /**
     * 模板层级关系
     */
    private List<TemplateTier> templateTierList;

    /**
     * 表单的关联关系
     * */
    private List<RelationData> relations = new ArrayList<>();
}
