package inheritance2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Eyüp", "Duran", "eduran@gmail.com", "12345");
		UserManager usermanager = new UserManager();
		usermanager.login(user1);

		System.out.println("*****************************************");

		Student student1 = new Student(2, "Salih", "Akdemir", "salih1@email.com", "1234567", "PAÜ",
				new String[] { "Engin Demiroð", "Mustafa Murat Çoþkun" },
				new String[] { "Matematik", "Fizik", "Elektrik" });

		StudentManager studentManager = new StudentManager();
		studentManager.getAllInstructor(student1);
		System.out.println("*****************************************");
		studentManager.getAllLessons(student1);

		System.out.println("*****************************************");

		Instructor instructor1 = new Instructor(3, "Engin", "Demirog", "engin@email.com", "123456",
				new String[] { "Java Programlama", "C#", "Python" },
				new String[] { "Eyüp", "Savaþ", "Fikret", "Hamza" });

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getAllCourses(instructor1);
		System.out.println("*****************************************");
		instructorManager.getAllStudents(instructor1);
		System.out.println("*****************************************");

		studentManager.logOut(instructor1);

	}
}
