package com.finalAssesment.Assesmentpractice.service;

import com.finalAssesment.Assesmentpractice.entity.User;
import com.finalAssesment.Assesmentpractice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User postNewUser(User user) {
        return userRepo.save(user);
    }
}
