package com.test.demo.service.impl;

import com.test.demo.mapper.ManagerUserMapper;
import com.test.demo.pojo.ManagerUser;
import com.test.demo.pojo.ManagerUserExample;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:  Air
 * Date  :  2017-11-09.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ManagerUserMapper userMapper;

    @Override
    public Integer register(ManagerUser user) {
        return userMapper.insert(user);
    }

    @Override
    public List<ManagerUser> login(ManagerUser user) {
        ManagerUserExample example = new ManagerUserExample();
        ManagerUserExample.Criteria criteria = example.createCriteria();
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        List<ManagerUser> list = userMapper.selectByExample(example);
        return list;
    }
}
