package dataAccess.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
}
