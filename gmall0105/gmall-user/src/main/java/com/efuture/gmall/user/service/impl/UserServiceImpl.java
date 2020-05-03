package com.efuture.gmall.user.service.impl;


import com.efuture.gmall.bean.UmsMember;
import com.efuture.gmall.user.mapper.UserMapper;
import com.efuture.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
      List<UmsMember> umsmember=  userMapper.selectAll();
        return umsmember;
    }
}
