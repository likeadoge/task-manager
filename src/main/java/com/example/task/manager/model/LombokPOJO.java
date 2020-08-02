package com.example.task.manager.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
public class LombokPOJO {
    private String name;
    private Integer age;
}
