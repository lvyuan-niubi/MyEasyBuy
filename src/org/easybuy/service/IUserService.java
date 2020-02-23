package org.easybuy.service;

import org.easybuy.entity.User;

public interface IUserService {

    public User queryUserByLoginName(String loginName);

    public User insertUserByUser(User user );
}
