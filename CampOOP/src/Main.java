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
		
		
		Instructor �nstructor = new Instructor();
		�nstructor.setId(1);
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setEmail("engindemir@hotmail.com");
		�nstructor.setGiveLecture("JAVA-REACT");
		�nstructor.setDescription("A��klama");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		studentManager.login(student);
		studentManager.registerLecture(student);
		studentManager.startLecture(student);
		
		System.out.println("\n");
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.register(�nstructor);
		�nstructorManager.login(�nstructor);
		�nstructorManager.addLecture(�nstructor);
		�nstructorManager.updateLecture(�nstructor);
		�nstructorManager.deleteLecture(�nstructor);
		
	}

}
