package core.concretes;

import core.abstracts.GoogleService;
import googleAuth.GoogleManager;

public class GoogleServiceManagerAdapter implements GoogleService {
	public void giveInformationToSystem(String message) {
		
		GoogleManager googlemanager = new GoogleManager();
		googlemanager.logInWithGoogleAccount(message);
		
		
		
		
	}
}
