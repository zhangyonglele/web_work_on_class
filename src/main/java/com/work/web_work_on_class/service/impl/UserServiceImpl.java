package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.mapper.UserMapper;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByEmail(String email) {
        return userMapper.selectByUserEmail(email);
    }

    @Override
    public User getUserByTel(String tel) {
        return null;
    }

    @Override
    public boolean addNewUser(User record) {
        boolean flag = false;
        try{
            userMapper.insert(record);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
