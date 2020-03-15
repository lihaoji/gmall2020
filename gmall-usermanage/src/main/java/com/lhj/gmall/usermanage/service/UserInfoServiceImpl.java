package com.lhj.gmall.usermanage.service;

import com.lhj.gmall.bean.UserInfo;
import com.lhj.gmall.service.UserInfoService;
import com.lhj.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lihaoji
 * @create 2020-03-15 21:39
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoList() {

        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
