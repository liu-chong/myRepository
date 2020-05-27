package com.example.demo.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebResponse<T> {
    private Integer code;
    private String message;
    private T data;
}