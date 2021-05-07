import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.GoogleServiceManagerAdapter;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new InMemoryUserDao(),new GoogleServiceManagerAdapter() );
          //userService.register(new User(1,"Eyüp","Duran","123456","eduran@gmail.com"));
         // userService.register(new User(1,"Eyüp","Duran","123456","eduran"));
          User user1=new User(1,"yunus","Akdemir","12345","eduran@gmail.com");
		 userService.register(user1);
		 userService.login(user1);
		 userService.delete(user1);
		 System.out.println(userService.getByMail("eduran@gmail.com"));
	}

}
