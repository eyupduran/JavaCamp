package inheritance2;

public class UserManager {

	public void login(User user) {
		System.out.println(user.getfirstName() + " baþarýyla giriþ yaptýnýz");
	}
	public void logOut(User user) {
		System.out.println(user.getfirstName() + " baþarýyla cýkýþ yaptýnýz");
	}
}
