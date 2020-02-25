package org.easybuy.service;

import org.easybuy.entity.User;

import java.util.List;

public interface IUserService {

    public User queryUserByLoginName(String loginName);

    public User insertUserByUser(User user );

    public List<User> queryAllUser();
}
