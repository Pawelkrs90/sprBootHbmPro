package com.project.service;



import com.project.dao.*;
import com.project.model.User;
import java.util.List;

public interface UserDaoService{
    
    User getById(Long id);
    List<User> getAll();
    void add(User user);
    void update(User userNew);
    void delete(User user);
}