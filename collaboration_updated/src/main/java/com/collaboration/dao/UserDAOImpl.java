package com.collaboration.dao;

	import javax.transaction.Transactional;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.stereotype.Repository;
	import com.collaboration.model.UserModel;


	@ComponentScan("com")
	@Repository("UserDAOImpl")
	@Transactional
	
	public class UserDAOImpl implements UserDAO {
		@Autowired
		private SessionFactory sessionFactory;
		
		public void addUser(UserModel userModel) 
		{
			Session session=sessionFactory.getCurrentSession();
			session.save(userModel);
			System.out.println("user saved");
		}

		
	}
