package com.collaboration.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.collaboration.model.UserModel;

@ComponentScan("com")
@Repository

public interface UserDAO {
	
	public void addUser(UserModel userModel);

}
