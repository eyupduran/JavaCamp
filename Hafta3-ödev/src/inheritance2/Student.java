package inheritance2;

public class Student extends User{
	private String schoolName;
	private String[] instructors;
	private String [] lessons;
	
	 public Student() {}
	 
	
	public Student(int id, String firstName, String lastName, String email, String password, String schoolName,String[] instructors, String[] lessons) {
		super(id, firstName, lastName,  email,password);
		this.schoolName=schoolName;
		this.instructors = instructors;
		this.lessons = lessons;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String[] getInstructors() {
		return instructors;
	}

	public void setInstructors(String[] instructors) {
		this.instructors = instructors;
	}

	public String[] getLessons() {
		return lessons;
	}

	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}
	

}
