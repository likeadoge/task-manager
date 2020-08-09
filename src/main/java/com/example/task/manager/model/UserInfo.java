package com.example.task.manager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Data
@Slf4j
@Builder
public class UserInfo {

    public static List<UserInfo> allList = Arrays.asList(new UserInfo[]{
            UserInfo.builder()
                    .account("likeadoge")
                    .name("召伯树")
                    .uid("66ccff")
                    .password("66ccff")
                    .build()
    });

    @JsonIgnore
    private String password;
    private String uid;
    private String name;
    private String account;
    private String avatar;
}
