package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.provider.api.dto.UserInfoDTO;
import com.example.provider.api.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Reference(check = false)
    private UserInfoService userInfoService;

    @RequestMapping(value = "hello")
    public String sayHello(){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setName("萧炎");
        userInfoService.saveUserInfo(userInfoDTO);
        return "hello world";
    }
}
