package Manager;

import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void addLecture(Instructor ýnstructor) {
		System.out.println(ýnstructor.getGiveLecture() + " dersi eklendi");
	}
	public void updateLecture(Instructor ýnstructor) {
		System.out.println(ýnstructor.getGiveLecture() + " dersi güncellendi");
	}
	public void deleteLecture(Instructor ýnstructor) {
		System.out.println(ýnstructor.getGiveLecture() + " dersi silindi");
	}
}
