package ödev2;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManager {
	Scanner scan=new Scanner(System.in);
	
	ArrayList<Category> categories=new ArrayList<Category>();
			
    public void Add(Category category) {
    	categories.add(category);
    	System.out.println("Category added!");
    }
	 public void Delete(Category category) {
		 
		 categories.remove(category);
		    System.out.println("Category removed!");	
	    }
	 public void Update(Category category) {
		System.out.println("Güncel isim");
		String ad=scan.nextLine();
		category.name=ad;
		
		System.out.println("Güncel id");
		int id=scan.nextInt();
	   category.id=id;
	    System.out.println("Category Updated!");	
	}
		   
	 
	 public void GetAll(){
		  for (Category _category : categories) {
				System.out.println("Category name is " + _category.name );
				System.out.println("Category id is " + _category.id);
				System.out.println("-----------------------");
			}
	 }
	 
		
	
	
}