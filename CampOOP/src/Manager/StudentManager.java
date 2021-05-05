package Manager;

import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager {
	public void registerLecture(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + 
				" kullan�c� derse kay�t oldu");
	}
	public void startLecture(Student student) {
		System.out.println(student.getReceiveLecture() + " dersinde"
				+" %"+student.getRateLecture()+ " oran�nda tamamlad�");
	}
}
