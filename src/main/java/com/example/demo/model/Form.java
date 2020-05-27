package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Form extends BasePO{
    /**
     * 模板ID
     */
    private String  templateId;

    /**
     * 模板名称
     */
    private String  templateName;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 版本号
     */
    private Double version;

    /**
     * 表单在模板中的顺序
     */
    private String sort;

    /**
     * 表单问题总数
     */
    private Integer formQuestionCount;

    /**
     * 表单说明
     */
    private String formMemo ;

    /**
     * 关联的问题组
     */
    List<GroupData> groups= new ArrayList<>();

    /**
     * 表单时间标记
     */
    private String formTimeTag ;

    /**
     * 表单类型
     */
    private String formType ;

    /**
     * 临床路径
     * */
    private PathWayModel pathWay;

    /**
     * 表单临床路径排序
     * */
    private FormSortModel formSort;

    /**
     * 关联标志
     * */
    private Boolean related;

    /**
     * 关联关系
     * */
    private List<RelationData> relations = new ArrayList<>();

    /**
     * 问题组总数
     */
    private Integer groupCount;

    /**
     * 层级路径字符串
     */
    private String tierPath;

    /**
     * 层级id
     */
    private String tierId;
}
