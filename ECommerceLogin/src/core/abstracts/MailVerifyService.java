package core.abstracts;

import java.util.Random;

import entities.concretes.User;
import java.util.List;


public interface MailVerifyService {
	public boolean randomVerify(User user);
}
