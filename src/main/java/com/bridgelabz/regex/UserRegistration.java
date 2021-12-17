package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  Custom Exception Test for firstname, lastname, username, password
 */
public class UserRegistration {

	// method for check firstName pattern
	public boolean isFirstName(String fname) throws CustomException.InvalidFirstName {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		if (matcher.matches()) {
			return true;
		}
		throw new CustomException.InvalidFirstName("FirstName should be start with cap and length is minimum 3");
	}

	// method for check lastName pattern
	public boolean isLastName(String lname) throws CustomException.InvalidLastName {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lname);
		if (matcher.matches()) {
			return true;
		}
		throw new CustomException.InvalidFirstName("LastName should be start with cap and length is minimum 3");
	}

	// method for check validEmail pattern
	boolean isValidEmail(String email) throws CustomException.InvalidEmail {
		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		throw new CustomException.InvalidEmail("Email should have 3 mandatory parts and 2 optional");
	}

	// method for check mobileNumber pattern
	boolean isValidMobileNumber(String phone) throws CustomException.InvalidMobile {
		String regex = "^[0-9]{2}+[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if (matcher.matches()) {
			return true;
		}
		throw new CustomException.InvalidMobile("Country code follwed by space and 10 digit number");
	}

	// method for check password pattern
	boolean isValidPassword(String pass) throws CustomException.InvalidPassword {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		throw new CustomException.InvalidPassword(
				"Minimum 8 characters, atleast 1 uppercase,1 numeric , exact 1 special character");
	}

}