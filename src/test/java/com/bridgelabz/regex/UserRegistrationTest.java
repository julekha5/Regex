package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
     
	boolean result;
	UserRegistration userTest = new UserRegistration();
	
	@Test
	public void firstName_IsValid_PassTest() {
		result = userTest.isFirstName("Julekha");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void firstName_IsValid_FailTest() {
		result = userTest.isFirstName("julekha");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_PassTest() {
		result = userTest.isLastName("Mulani");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_FailTest() {
		result = userTest.isLastName("MulaNi");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_PassTest() {
		result = userTest.isValidEmail("abc.100@yahoo.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_FailTest() {
		result = userTest.isValidEmail("abc1236");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_IsValid_PassTest() {
		result = userTest.isMobileNumber("91 9898989978");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_IsValid_FailTest() {
		result = userTest.isMobileNumber("991234567890");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void password_IsValid_PassTest() {
		result = userTest.isValidPassword("fdjowiei8776#A");
		Assert.assertEquals(true,result);
	}
	@Test
	public void password_IsValid_FailTest() {
		result = userTest.isValidPassword("abvlkkm.-");
		Assert.assertEquals(true,result);
	}
	
	
}	