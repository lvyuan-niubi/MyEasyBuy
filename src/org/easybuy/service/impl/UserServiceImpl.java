package org.easybuy.service.impl;

import javafx.application.Application;
import org.easybuy.entity.User;
import org.easybuy.mapper.UserMapper;
import org.easybuy.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    //dao 接口
    UserMapper user = null;

    /*根据用户名 查询用户*/
    @Override
    public User queryUserByLoginName(String loginName) {
        return user.queryUserByLoginName(loginName);
    }

    @Override
    public User insertUserByUser(User user1) {
        /*插入用户*/
        user.insertUserByUser(user1);
        /*查询用户返回*/
        return user.queryUserByLoginName(user1.getLoginName());
    }

    /*查询所有用户*/
    @Override
    public List<User> queryAllUser() {
        return user.queryAllUser();
    }

    public void setUser(UserMapper user) {
        this.user = user;
    }
}
