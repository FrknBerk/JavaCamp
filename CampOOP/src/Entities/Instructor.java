package Entities;

public class Instructor extends User{
	String giveLecture;
	String description;
	
	public Instructor() {
	}
	
	public Instructor(String giveLecture, String description) {
		this.giveLecture = giveLecture;
		this.description = description;
		System.out.println("Instructor");
	}
	
	public String getGiveLecture() {
		return giveLecture;
	}
	public void setGiveLecture(String giveLecture) {
		this.giveLecture = giveLecture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
