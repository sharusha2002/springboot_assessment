package com.finalAssesment.Assesmentpractice.repository;

import com.finalAssesment.Assesmentpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
