package com.moviemax.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.moviemax.entity.Login;


public interface LoginRepository extends JpaRepository<Login,String> {
	List<Login> findByUsername(String username);
}
