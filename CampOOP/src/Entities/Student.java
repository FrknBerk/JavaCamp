package Entities;

public class Student extends User{
	String receiveLecture;
	int rateLecture;
	
	public Student() {
		
	}
	
	public Student(String receiveLecture, int rateLecture) {
		System.out.println("Student");
		this.receiveLecture = receiveLecture;
		this.rateLecture = rateLecture;
	}
	public String getReceiveLecture() {
		return receiveLecture;
	}
	public void setReceiveLecture(String receiveLecture) {
		this.receiveLecture = receiveLecture;
	}
	public int getRateLecture() {
		return rateLecture;
	}
	public void setRateLecture(int rateLecture) {
		this.rateLecture = rateLecture;
	} 
}
