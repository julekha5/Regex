package regex.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user mobile number with regex
 */
public class UserRegistration {
	// method for mobile number pattern
	public boolean isMobileNumber(String phone) {
		String regex = "^[0-9]{2}+[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println(user.isMobileNumber("91 9999999999"));
		System.out.println(user.isMobileNumber("919999999999"));
	}
}