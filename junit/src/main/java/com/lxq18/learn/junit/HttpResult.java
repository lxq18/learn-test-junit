package com.lxq18.learn.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HttpResult {
    private int statusCode;
    private String body;
}
