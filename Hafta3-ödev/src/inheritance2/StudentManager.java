package inheritance2;

public class StudentManager extends UserManager {
   
	public void getAllInstructor(Student student) {
		for (int i=0;i<student.getInstructors().length;i++) {
			System.out.println("Eğitmen " + (i+1) + " = " + student.getInstructors()[i]);
		}
	}
	
	public void getAllLessons(Student student) {
		for (int i=0;i<student.getLessons().length;i++) {
			System.out.println("Eğitim " + (i+1) + " = " + student.getLessons()[i]);
		}
	}
	
	
}
