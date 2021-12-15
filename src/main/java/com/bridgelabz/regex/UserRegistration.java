package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user first name with regex
 */
public class UserRegistration {
	// method for check firstName pattern
	public boolean isFirstName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	// method for check lastName pattern
	public boolean isLastName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	// method for check validEmail pattern
	 boolean isValidEmail(String email) {
			String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				return true;
			}
			return false;
		}
	 
	 // method for check mobileNumber pattern
	 boolean isMobileNumber(String phone) {
			String regex = "^[0-9]{2}+[ ][0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phone);
			if (matcher.matches()) {
				return true;
			}
			return false;
		}
	
	 // method for check password pattern
	 boolean isValidPassword(String pass) {
	        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(pass);
			if (matcher.matches()) {
				return true;
			}
			return false;
		}


}
