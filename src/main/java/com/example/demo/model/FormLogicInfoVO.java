package com.example.demo.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FormLogicInfoVO extends BasePO {

    /**
     * 模板ID
     */
    private String  templateId;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 特殊选项问题列表
     * */
    private List<ItemDataMI> specificOptionItems= new ArrayList<>();

    /**
     * 级联问题列表
     * */
    private List<ItemDataMI> collectionOptionItems= new ArrayList<>();

    /**
     * 浮点和整数问题列表
     * */
    private List<ItemDataMI> gapItems= new ArrayList<>();

    /**
     * 本题的前序关联关系
     */
    private List<RelationData> relations = new ArrayList<>();

    /**
     * 必填问题列表
     * */
    private List<ItemDataMI> mustWriteItems= new ArrayList<>();

    /**
     * 重要问题列表
     * */
    private List<ItemDataMI> importantItems= new ArrayList<>();

    /**
     * 表单时间标记
     * */
    private String formTimeTag ;

    /**
     * 统一问题组底下，相同的点位
     */
    private List<SampleGroupData> sampleInOneGroupList = new ArrayList<>();


}
