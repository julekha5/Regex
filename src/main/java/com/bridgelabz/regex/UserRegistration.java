package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Of Functional Interface and Lambda Expression 
 */
@FunctionalInterface
interface IFirstName {
//To check valid first name method	
	public boolean isFirstName(String fname);
}

public class UserRegistration {

	public boolean isFirstName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(fname);
		/*
		 * other logic Predicate<Pattern> predicateObj = matcher ->
		 * matcher.matcher(fname).matches();
		 */
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isFirstName("Julekha")); // true
		System.out.println(user.isFirstName("julekha")); // false
	}
}
