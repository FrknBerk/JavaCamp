package business.concretes;

import java.util.ArrayList;

import business.abstracts.UserService;
import core.abstracts.GoogleAccountService;
import core.abstracts.MailVerifyService;
import core.abstracts.RegexService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private GoogleAccountService googleAccountService;
	private RegexService regexService;
	private MailVerifyService mailVerifyService;
	
	public UserManager(UserDao userDao, GoogleAccountService googleAccountService, RegexService regexService, MailVerifyService mailVerifyService) {
		super();
		this.userDao = userDao;
		this.googleAccountService = googleAccountService;
		this.regexService = regexService;
		this.mailVerifyService = mailVerifyService;
		
	}

	@Override
	public void register(User user,ArrayList<User> users) {
		// TODO Auto-generated method stub
		boolean isEmail = false;
		for(User userfor:users) {
			if(userfor.getEmail() == user.getEmail()) {
				isEmail = true;
				System.out.println("Kullanýcý var");
			}
		}
		if(user.getPassword().length()>=6 && user.getFirstName().length()>=2  && isEmail ==false &&
				user.getLastName().length() >= 2 && regexService.checkEmail(user.getEmail()) && mailVerifyService.randomVerify(user)) {
			userDao.register(user);
			users.add(user);
		}
		else {
			System.out.println("Bilgiler yanlýþ");
		}
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+" login iþlemi yapýldý");
	}

	@Override
	public void registerGoogleAccount(User user) {
		// TODO Auto-generated method stub
		if(user.getPassword().length()>=6 && user.getFirstName().length()>=2   &&
				user.getLastName().length() >= 2 && !regexService.checkGoogleEmail(user.getEmail()) && mailVerifyService.randomVerify(user)) {
			
			
			googleAccountService.registerToGoogle(user.getEmail());
		}
		else {
			System.out.println("Bilgiler yanlýþ");
		}
		
	}

	@Override
	public ArrayList<User> getAll(ArrayList<User> users) {
		// TODO Auto-generated method stub
		for(User user :users) {
			System.out.println(user.getId() +  " " + user.getFirstName() + "  " +
		user.getLastName() );
		}
		return users;
	}


}
