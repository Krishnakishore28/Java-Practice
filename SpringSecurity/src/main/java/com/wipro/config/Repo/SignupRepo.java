package com.wipro.config.Repo;

import org.springframework.stereotype.Repository;

import com.wipro.config.dto.SignupDto;


public interface SignupRepo {
	void save(SignupDto signupDto);
}
