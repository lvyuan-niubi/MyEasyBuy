package org.easybuy.mapper;

import org.easybuy.entity.User;

import java.util.List;

/*
* Mybatis接口 and Dao
* */
public interface UserMapper {

    public User queryUserByLoginName(String loginName);

    public void insertUserByUser(User user );

    public List<User> queryAllUser();

}
