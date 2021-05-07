package business.concretes;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.abstracts.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private GoogleService googleService;
	public static final Pattern Email_Regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public UserManager(UserDao userDao, GoogleService googleLoggerService) {
		super();
		this.userDao = userDao;
		this.googleService = googleLoggerService;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Þifreniz en az 6 karakter olmalý !");
			return;
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (!matcher.matches()) {
			System.out.println("Mail adresi e posta formatinda olmalidir.");
			return;
		}

		if (userDao.getEmail(user.getEmail()) != null) {
			System.out.println("Kullanici zaten mevcut.");
			return;
		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("isminiz 2 karakterden uzun olmalidir");
			return;
		}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("E-Maili doðrulamak için 1'e ardýndan ENTER'a basýn.");
			int selecetion = scanner.nextInt();
			if (selecetion != 1) {
				System.out.println("Üzgünüz dogrulama basarisiz");
				return;
			}
		}
		userDao.add(user);
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Email ve Þifre zorunludur.Boþ býrakmayýnýz .");
			return;
		}
		if (userDao.getEmail(user.getEmail()) == null) {
			System.out.println("Kullanýcý bulunamadý .");
			return;
		}
		this.userDao.add(user);
		System.out.println(" Baþarýyla giriþ yapýldý . ");

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

	@Override
	public User getByMail(String mail) {
		return userDao.getEmail(mail);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
