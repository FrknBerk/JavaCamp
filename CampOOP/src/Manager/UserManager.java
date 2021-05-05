package Manager;

import Entities.User;

public class UserManager {
	public final void login(User user) {
		System.out.println(user.getFirstName()+user.getLastName() + 
				" giriþ yaptý");
	}
	public final void register(User user) {
		System.out.println(user.getFirstName() + " " +user.getLastName() + 
				" kayýt oldu");
	}
	
}
