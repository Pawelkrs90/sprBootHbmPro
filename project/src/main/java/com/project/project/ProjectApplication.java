package com.project.project;

import com.project.model.User;
import com.project.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
//@EnableAutoConfiguration
@ComponentScan({"com.project"})
@EntityScan( basePackages = {"com.project.model"} )
@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    UserDaoService userDaoService;
    
    public static void main(String[] args) {
            SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("...i WYSTARTOWALo");   
        User user = new User("ADMIN", "12345");
         
        userDaoService.add(user);

    }
        
}
