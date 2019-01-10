package com.fotoable.jkens.service.imp;

import com.fotoable.jkens.dao.IUserDao;
import com.fotoable.jkens.pojo.User;
import com.fotoable.jkens.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public List<User> getUser() {
        return userDao.getAllUser();
    }

    public int GetCount() {
        return userDao.GetCount();
    }
}
