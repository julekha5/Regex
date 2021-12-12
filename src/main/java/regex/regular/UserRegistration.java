package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule2 with regex
 * min 8 character and at least 1 upper case
 */
public class UserRegistration {
	// method for password rule2 pattern
	public boolean isValidPassword(String pass) {
        String regex = "^(?=.*[A-Z])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println(user.isValidPassword("ghjlp457A08"));
		System.out.println(user.isValidPassword("abv890456"));
	}
}