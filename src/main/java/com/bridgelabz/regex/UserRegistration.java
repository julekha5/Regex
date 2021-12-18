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

@FunctionalInterface
interface ILastName{
//To check valid last name method 
public boolean isLastName(String lname);
}


@FunctionalInterface
interface IEmail{
public boolean isValidEmail(String fname);
}


public class UserRegistration {
    
	// method for check first name pattern
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
	
	// method for check last name pattern
	public boolean isLastName(String lname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(lname);     
	}
    
	// method for check valid Email pattern
	public boolean isValidEmail(String email) {
		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(email);     
	}
	
	// method for check mobileNumber pattern
	public boolean isValidMobileNumber(String phone) {
			String regex = "^[0-9]{2}+[ ][0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Predicate<String> predicateObj = pattern.asPredicate();
			return predicateObj.test(phone);     		
	 }
	 
	// method for check password pattern
	public boolean isValidPassword(String pass)  {
			String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Predicate<String> predicateObj = pattern.asPredicate();
			return predicateObj.test(pass);     			 
	 }

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.isFirstName("Julekha")); 
		System.out.println(user.isLastName("Mulani")); 
		System.out.println(user.isValidEmail("abc@gmail.com")); 
		System.out.println(user.isValidMobileNumber("91 9898978780"));
        System.out.println(user.isValidPassword("fdjowiei8776#A"));
	}
}
