package Manager;

import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void addLecture(Instructor żnstructor) {
		System.out.println(żnstructor.getGiveLecture() + " dersi eklendi");
	}
	public void updateLecture(Instructor żnstructor) {
		System.out.println(żnstructor.getGiveLecture() + " dersi gŁncellendi");
	}
	public void deleteLecture(Instructor żnstructor) {
		System.out.println(żnstructor.getGiveLecture() + " dersi silindi");
	}
}
