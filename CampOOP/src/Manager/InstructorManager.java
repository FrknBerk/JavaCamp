package Manager;

import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void addLecture(Instructor �nstructor) {
		System.out.println(�nstructor.getGiveLecture() + " dersi eklendi");
	}
	public void updateLecture(Instructor �nstructor) {
		System.out.println(�nstructor.getGiveLecture() + " dersi g�ncellendi");
	}
	public void deleteLecture(Instructor �nstructor) {
		System.out.println(�nstructor.getGiveLecture() + " dersi silindi");
	}
}
