package core.concretes;

import core.abstracts.GoogleAccountService;
import core.abstracts.RegexService;
import googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements GoogleAccountService{

	@Override
	public void registerToGoogle(String email) {
		// TODO Auto-generated method stub
		GoogleAccountManager acount = new GoogleAccountManager();
		acount.register(email);
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		GoogleAccountManager acount = new GoogleAccountManager();
		acount.login();
	}
}
