package com.finalAssesment.Assesmentpractice.controller;

import com.finalAssesment.Assesmentpractice.entity.User;
import com.finalAssesment.Assesmentpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/new")
    public User postNewUser(@RequestBody User user){
return userService.postNewUser(user);

    }

}
