package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user first name with regex
 */
public class UserRegistration {
	// method for check firstname pattern
	public boolean isFirstName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration first = new UserRegistration();
		System.out.println(first.isFirstName("Julekha"));
		System.out.println(first.isFirstName("JulekhaA"));
	}
}