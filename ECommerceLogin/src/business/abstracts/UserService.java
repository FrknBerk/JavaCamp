package business.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserService {
	void register(User user,ArrayList<User> users);
	void registerGoogleAccount(User user);
	void login(User user);
	ArrayList<User> getAll(ArrayList<User> users);
}
