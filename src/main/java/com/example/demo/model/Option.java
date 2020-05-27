package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Option  implements Serializable {
    /**
     * 选项内容
     */
    private  String name;
    /**
     * 选项序号 从0开始
     */
    private  String value;
    /**
     * 概念Id
     */
    private String conceptId;
    /**
     * 术语Id
     */
    private String termId;
    /**
     * 可选项说名
     */
    private String explain;

    private String label;
}
