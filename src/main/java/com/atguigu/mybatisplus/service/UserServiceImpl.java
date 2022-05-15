package com.atguigu.mybatisplus.service;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/5 11:43
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
