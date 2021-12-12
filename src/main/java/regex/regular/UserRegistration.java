package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule1 with regex
 */
public class UserRegistration {
	// method for password rule1 pattern
	public boolean isValidPassword(String pass) {
        String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println(user.isValidPassword("abc#2345.#"));
		System.out.println(user.isValidPassword("91smsm,"));
	}
}