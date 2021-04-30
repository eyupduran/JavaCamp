package inheritance2;

public class Instructor extends User  {
	private String[] courses;
	private String[] students;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password,String[] courses, String[] students) {
		super(id, firstName, lastName,  email,password);
		this.courses = courses;
		this.students = students;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getStudents() {
		return students;
	}

	public void setStudents(String[] students) {
		this.students = students;
	}
	
	
	
}
