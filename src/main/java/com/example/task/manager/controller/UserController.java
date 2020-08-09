package com.example.task.manager.controller;

import com.example.task.manager.AjaxRequest;
import com.example.task.manager.model.UserInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping( value = "/userInfo/{uid}",method = RequestMethod.GET)
    public AjaxRequest getUserInfoByUid(@PathVariable("uid") String uid) {
        UserInfo cur = UserInfo.allList.stream()
                .filter(user-> uid.equals(user.getUid()))
                .findFirst().orElse(null);

        if(cur == null){
            return  AjaxRequest.error(404,"用户不存在！");
        }else{
            return AjaxRequest.success(cur);
        }
    }

    @RequestMapping( value = "/userInfo",method = RequestMethod.GET)
    public AjaxRequest getAllUserInfo() {
        return AjaxRequest.success(UserInfo.allList);
    }
}
