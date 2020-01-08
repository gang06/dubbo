package com.example.provider.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.provider.api.dto.UserInfoDTO;
import com.example.provider.api.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public void saveUserInfo(UserInfoDTO userInfoDTO) {
        System.out.println(userInfoDTO.getName());
    }
}
