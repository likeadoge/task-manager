package com.example.task.manager;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AjaxRequest {

    public static AjaxRequest error(Integer code, String message){
        return AjaxRequest.builder().code(code).data(null).message(message).success(false).build();
    }

    public static AjaxRequest success(Object data){
        return AjaxRequest.builder().code(200).data(data).message("请求成功！").success(true).build();
    }

    private boolean success;
    private Integer code;
    private String message;
    private Object data;
}
