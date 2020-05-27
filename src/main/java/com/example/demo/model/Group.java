package com.example.demo.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class Group implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;

    private String name;
}
