package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Illness {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;

    private String name;
}
