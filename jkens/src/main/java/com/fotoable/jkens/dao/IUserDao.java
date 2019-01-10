package com.fotoable.jkens.dao;

import com.fotoable.jkens.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    public List<User> getAllUser();
    public int GetCount();
}
