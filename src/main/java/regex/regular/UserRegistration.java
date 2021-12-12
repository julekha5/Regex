package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule4 with regex
 * min 8 character
 * one upper case
 * one numeric
 *  at least 1 special character 
 */
public class UserRegistration {
	// method for password rule2 pattern
	public boolean isValidPassword(String pass) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println(user.isValidPassword("fdjowiei8776#A"));
		System.out.println(user.isValidPassword("abvlkkm.-"));
	}
}