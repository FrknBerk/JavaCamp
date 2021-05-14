

import java.util.ArrayList;
import java.util.Scanner;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.MailVerifyService;
import core.concretes.GoogleAccountManagerAdapter;
import core.concretes.MailVerifyManager;
import core.concretes.RegexManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Kullanýcý google ile kayýt olma iþlemi Dao da yazmamýza gerek
		 * var mý yoksa adapter þeklinde çaðýrmamýz lazým kontrol et */
		
		
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleAccountManagerAdapter(),new RegexManager(),new MailVerifyManager());
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Furkan Berk");
		user.setLastName("Akdas");
		user.setEmail("frknbrk@hotmail.com");
		user.setPassword("123123");
		

		User user1 = new User();
		user1.setId(2);
		user1.setFirstName("mert");
		user1.setLastName("tekin");
		user1.setEmail("asd@hotmail.com");
		user1.setPassword("2313ad");
		
		User user2 = new User();
		user2.setId(3);
		user2.setFirstName("Bekir");
		user2.setLastName("demir");
		user2.setEmail("brk@hotmail.com");
		user2.setPassword("32432432");
		
		User user3 = new User();
		user3.setId(4);
		user3.setFirstName("Melis");
		user3.setLastName("Sevinç");
		user3.setEmail("mls@hotmail.com");
		user3.setPassword("adsa323");
		

        User user4 = new User();
        user4.setId(5);
        user4.setEmail("veli@hotmail.com");
        user4.setFirstName("Veli");
        user4.setLastName("Þeker");
        
        User user5 = new User();
        user5.setId(6);
        user5.setEmail("mstf@hotmail.com");
        user5.setFirstName("Mustafa");
        user5.setLastName("Anýl");
        
        User user6 = new User();
        user6.setId(7);
        user6.setEmail("brsk@hotmail.com");
        user6.setFirstName("Serpil");
        user6.setLastName("Akdas");
        user6.setPassword("asdasdsa");
        
       
  
        
      

		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
		
		User user7 = new User();
		user7.setFirstName("Derin");
		user7.setLastName("Sezgi");
		user7.setEmail("brks@gmail.com");
		user7.setPassword("1234567");
		
	
		
		userService.getAll(users);
	    System.out.println("********************************");
		userService.register(user7,users);
	    System.out.println("********************************");
		userService.getAll(users);
	    System.out.println("********************************");
		//userService.getAll(users);	
	    System.out.println("********************************");
		userService.registerGoogleAccount(user7);
	    System.out.println("********************************");
		userService.login(user7);
		
	}
	

}
