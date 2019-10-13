package com.moviemax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviemax.entity.User;

public interface UserRepository extends JpaRepository<User,String> {

}
