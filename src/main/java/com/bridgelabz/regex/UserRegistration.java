package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Of Functional Interface and Lambda Expression 
 */

@FunctionalInterface
interface ILastName {
//To check valid last name method 
	public boolean isLastName(String lname);
}

public class UserRegistration {

	public boolean isLastName(String lname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(lname);
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isLastName("Mulani")); // true
		System.out.println(user.isLastName("muLani")); // false
	}
}
