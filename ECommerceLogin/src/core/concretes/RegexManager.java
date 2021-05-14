package core.concretes;

import java.util.regex.Pattern;

import core.abstracts.RegexService;

public class RegexManager implements RegexService{

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		//System.out.println(pattern.matcher("frknbrk@hotmail.com").find());
		boolean emailValid= pattern.matcher(email).find();
		if (emailValid) {
			System.out.println("Geçerli Email");
			return true;
		}
		else {
			System.out.println("Email adresi yanlýþ");
			return false;
		}
	}

	@Override
	public boolean checkGoogleEmail(String email) {
		// TODO Auto-generated method stub
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[^G0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		boolean emailValid= pattern.matcher(email).find();
		if (emailValid) {
			System.out.println("Google hesabýyla giriþ yapýlmadý");
			return true;
		}
		else {
			System.out.println("Google hesabýnýz");
			return false;
		}
	}
	

}
