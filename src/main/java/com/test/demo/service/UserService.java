package com.test.demo.service;

import com.test.demo.pojo.ManagerUser;

import java.util.List;

/**
 * Author:  Air
 * Date  :  2017-11-09.
 */
public interface UserService {

    Integer register(ManagerUser user);

    List<ManagerUser> login(ManagerUser user);

}
