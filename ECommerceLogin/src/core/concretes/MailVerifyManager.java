package core.concretes;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import core.abstracts.MailVerifyService;
import entities.concretes.User;

public class MailVerifyManager implements MailVerifyService{

	@Override
	public boolean randomVerify(User user ) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		String numberRandom = user.getFirstName() +String.valueOf(rnd.nextInt(1000));
		System.out.println(user.getEmail() + " doðrulama kodunuz : " +numberRandom.toLowerCase());
		System.out.println("Doðrulama kodunu giriniz : ");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		if(number.equals(numberRandom.toLowerCase())) {
			//userService.register(user);
			System.out.println("Doðrulama kodu baþarýlý");
			return true;
		}else {
			System.out.println("Doðrulama kodu yanlýþ");
			return false;
		}
	}


}
