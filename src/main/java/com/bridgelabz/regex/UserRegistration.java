package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  sample email test
 */
public class UserRegistration {
	// method for check validEmail pattern
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
		UserRegistration email = new UserRegistration();
		System.out.println(email.isValidEmail("abc@yahoo.com"));
	}
}