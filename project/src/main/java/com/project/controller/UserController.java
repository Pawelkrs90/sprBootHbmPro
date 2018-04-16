package com.project.controller;

import com.project.model.User;
import com.project.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("User")
public class UserController {
    
    @Autowired
    private UserDaoService userDaoService;
    
    @GetMapping("getById/{id}")
    public ResponseEntity<User> getArticleById(@PathVariable("id") Integer id) {
        User user = userDaoService.getById(new Long(id));
	return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
}
