package com.lhj.gmall.usermanage.comtroller;

import com.lhj.gmall.bean.UserInfo;
import com.lhj.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lihaoji
 * @create 2020-03-15 21:40
 */
@RestController
@RequestMapping("/usermanager")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }

}
