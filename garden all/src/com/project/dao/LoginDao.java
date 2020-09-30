package com.project.dao;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entities.User;
import com.project.models.entUser;

@Repository
public class LoginDao
{
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly=true)
	public User findUser(User user)
	{
	
		Session session = factory.getCurrentSession();
	
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("email_id",user.getEmail_id()));
		return  (User)cr.uniqueResult();
	
	}
}
