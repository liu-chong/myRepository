package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class RelationData implements Serializable {

    /**
     * 本题ID(其实是itemCode)
     */
    private  String itemId;

    /**
     * 绑定题目的所属表单ID
     */
    private  String bandFormId;

    /**
     * 绑定题目的所属问题组ID
     */
    private  String bandGroupId;

    /**
     * 绑定题目的所属问题组名称
     */

    private  String bandGroupName;

    /**
     * 绑定的问题编码
     */
    private  String banditemCode;


    private  String  groupId;

    /**
     *绑定点位选项名称
     */
    private  String[] bandSelectOption;

    /**
     * 绑定位置索引
     */
    private  String[] bandIndex;

//        /**
//         * 绑定的问题编码
//         */
//        private  String bandItemName;

    /**
     * 绑定题目的选项
     */
    private  String bandselectItem;

    /**
     * 绑定题目的选项名称
     */
    private  String bandSelectItemName;

    /**
     * 术语绑定类型
     * */
    private  String relationshipType;

    /**
     * 术语绑定类型Id
     * */
    private  String relationshipId;

    /**
     * 关联类型
     */
    private  String relationType;

    /**
     * 自己需要展示的选项
     */
    private  String optionCode;

    /**
     * 表单id
     */
    private String formId;

    /**
     * 表单name
     */
    private String formName;

    /**
     * 绑定的问题名称
     */
    private  String bandItemName;

    /**
     * 绑定的表单name
     */
    private  String bandFormName;
}
