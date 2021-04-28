package ödev2;

public class Main {

	public static void main(String[] args) {
	Category category1=new Category(1,"yazýlým");
	CategoryManager categoryManager=new CategoryManager();
    categoryManager.Add(category1);
    
    System.out.println("--------------");
    Course course1=new Course(10,"Java & React","Engin Demiroð");
	CourseManager courseManager=new CourseManager();
	courseManager.Add(course1);
	System.out.println("--------------");
	
	Category category2=new Category(2,"E ticaret");
    categoryManager.Add(category2);
    System.out.println("--------------");
    
    Category category3=new Category(3,"Yaz");
    categoryManager.Add(category3);
    System.out.println("--------------");
    
    Course course2=new Course(11,"C# & Angular","Engin Demiroð");
   	courseManager.Add(course2);
   	System.out.println("--------------");
  
   //	categoryManager.GetAll();
   	
   	//categoryManager.Update(category3);
   	categoryManager.Delete(category3);
   	
	categoryManager.GetAll();
	
	}

}
