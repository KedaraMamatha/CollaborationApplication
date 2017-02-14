package com.collaboration.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.collaboration.configuration.ApplicationContextConfig;
import com.collaboration.dao.UserDAO;
import com.collaboration.model.UserModel;

public class App {
	
public static void main( String[] args )
    {
       System.out.println("******** i m inside the app.java**********************");
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
UserDAO userDao=(UserDAO)annotationConfigApplicationContext.getBean("UserDAOImpl");
UserModel userModel=new UserModel();
System.out.println("-----------------------------insertion started------------------------");
userModel.setUsername("Kedara");
userModel.setPassword("12345");
userModel.setConformPassword("12345");
userModel.setEmailId("kmamatha1968@gmail.com");
userModel.setEnabled(true);
userDao.addUser(userModel);
System.out.println("-----------------------insertion ended----------------");

}

}
