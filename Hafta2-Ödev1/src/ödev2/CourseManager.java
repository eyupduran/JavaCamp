package ödev2;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManager {
	ArrayList<Course> courses=new ArrayList<Course>();
	Scanner scan=new Scanner(System.in);
    public void Add(Course course) {
    	courses.add(course);
    	System.out.println("Course added!");
    }
	 public void Delete(Course course) {
		 
		 courses.remove(course);
		    System.out.println("Course removed!");	
	    }
	 public void Update(Course course) {
			System.out.println("Güncel isim");
			String ad=scan.nextLine();
			course.name=ad;
			
			System.out.println("Güncel id");
			int id=scan.nextInt();
			course.id=id;
			
			System.out.println("Güncel eðitmen");
			String instructor=scan.nextLine();
			course.instructor=instructor;
			
		    System.out.println("Course Updated!");	
		    
		}
	 
	 public void GetAll(){
		  for (Course _course : courses) {
				System.out.println("Course name is " + _course.name );
				System.out.println("Course id is " + _course.id);
				System.out.println("Course instructor is " + _course.instructor);
			}
	 }
}
