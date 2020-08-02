package com.example.task.manager.controller;

import com.example.task.manager.AjaxRequest;
import com.example.task.manager.model.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public AjaxRequest hello(String name) {
        LombokPOJO lm = LombokPOJO.builder().name(name).age(20).build();
        return AjaxRequest.success(lm);
    }
}
