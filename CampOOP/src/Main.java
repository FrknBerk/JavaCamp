import Entities.Instructor;
import Entities.Student;
import Manager.InstructorManager;
import Manager.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Furkan");
		student.setLastName("Berk");
		student.setEmail("frknbrk@hotmail.com");
		student.setReceiveLecture("JAVA-REACT");
		student.setRateLecture(20);
		
		
		Instructor ınstructor = new Instructor();
		ınstructor.setId(1);
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setEmail("engindemir@hotmail.com");
		ınstructor.setGiveLecture("JAVA-REACT");
		ınstructor.setDescription("Açıklama");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		studentManager.login(student);
		studentManager.registerLecture(student);
		studentManager.startLecture(student);
		
		System.out.println("\n");
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.register(ınstructor);
		ınstructorManager.login(ınstructor);
		ınstructorManager.addLecture(ınstructor);
		ınstructorManager.updateLecture(ınstructor);
		ınstructorManager.deleteLecture(ınstructor);
		
	}

}
