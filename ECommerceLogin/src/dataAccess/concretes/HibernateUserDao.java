package dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() + " kullanýcý kayýt edildi.");
		
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() + " giriþ yaptý");
	}

}
