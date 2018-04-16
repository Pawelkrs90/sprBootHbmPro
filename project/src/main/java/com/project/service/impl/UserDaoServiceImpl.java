package com.project.service.impl;

import com.project.dao.UserDao;
import com.project.model.User;
import com.project.service.UserDaoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoServiceImpl implements UserDaoService{

    @Autowired
    UserDao userDao;

    @Override
    public User getById(Long id){
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User userNew) {
        userDao.update(userNew);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
    
}


