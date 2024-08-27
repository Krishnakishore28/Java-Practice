package com.wipro.config.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.wipro.config.dto.SignupDto;
@Repository
public class SignupRepoImpl implements SignupRepo{
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void save(SignupDto signupDto) {
		// TODO Auto-generated method stub
		String sql="insert into security.users values(?,?,?)";
		String sql1="insert into security.authorities values(?,?)";
		String password=passwordEncoder.encode(signupDto.getPassword());
		signupDto.setPassword(password);
		jdbcTemplate.update(sql, signupDto.getUsername(),signupDto.getPassword(),1);
		jdbcTemplate.update(sql1, signupDto.getUsername(),"USER");
		
	}

}
