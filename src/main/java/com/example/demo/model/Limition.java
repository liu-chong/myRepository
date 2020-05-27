package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Limition  implements Serializable {
    /**
     * 字符串最大长度
     */
    private Integer  maxlength;
    /**
     * 字符串最小长度
     */
    private Integer  minlength;
    /**
     * 最大值  整数与浮点数题型
     */
    private Integer  max;
    /**
     * 最小值  整数与浮点数题型
     */
    private Integer  min;
    /**
     * 小数点后位数
     */
    private Integer pointCount;
    /**
     * 1.纯字母 2.纯数字 3.时间 4.固定电话 5.手机号 6.身份证 7.URL 8.纯汉字 9.无内容约束 10.浮点数
     */
    private Integer  strType;
    /**
     * 计量单位
     */
    private String  unit;
}
