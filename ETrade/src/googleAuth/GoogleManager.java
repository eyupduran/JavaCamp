package googleAuth;

import entities.concretes.User;

public class GoogleManager {
	public void logInWithGoogleAccount(String message) {
		System.out.println("Google ile giris yaptýn: " + message);
	}
	public void register(User user){ 
        System.out.println("Kullanýcý Google yardýmýyla eklendi: " + user.getFirstName() + " " + user.getLastName().toUpperCase());
    } 
}
