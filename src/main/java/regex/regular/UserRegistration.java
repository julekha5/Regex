package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user email with regex
 */
public class UserRegistration {
	// method for email name pattern
	public boolean isValidEmail(String email) {
		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println(user.isValidEmail("abc@yahoo.com"));
		System.out.println(user.isValidEmail("abc-100@yahoo.com"));
		System.out.println(user.isValidEmail("abc.100@yahoo.com"));
		System.out.println(user.isValidEmail("abc111@abc.com"));
		System.out.println(user.isValidEmail("abc-100@abc.net"));
		System.out.println(user.isValidEmail("abc.100@abc.com.au"));
		System.out.println(user.isValidEmail("abc@1.com"));
		System.out.println(user.isValidEmail("abc@yahoo.com.com"));
		System.out.println(user.isValidEmail("abc+100@yahoo.com"));
	}
}