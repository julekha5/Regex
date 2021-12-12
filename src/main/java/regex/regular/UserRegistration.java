package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user last name with regex
 */
public class UserRegistration {
	// method for check last name pattern
	public boolean isLastName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isLastName("Mulani"));
		System.out.println(user.isLastName("MulaNi"));
	}
}