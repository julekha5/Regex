package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private UserRegistration email;
    private final boolean expected;
    private String email2;

    @Before
    public void initializeClass(){
    	email = new UserRegistration();
    }

    public UserRegistrationTest(UserRegistration email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList(){
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com",true} , {"abc-100@yahoo.com",true} ,
                {"abc.100@yahoo.com",true} , {"abc111@abc.com",true},
                {"abc-100@abc.net",true} , {"abc.100@abc.com.au",true},
                {"abc@1.com",true} , {"abc@yahoo.com.com",true},
                {"abc+100@yahoo.com",true} , {"abc@.com",false}
        });
    }
    @Test
	public void testUserRegistration(){
        Assert.assertEquals(expected,email.isValidEmail(email2));
    }
}