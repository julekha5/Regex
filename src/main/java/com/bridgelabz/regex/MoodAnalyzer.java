package com.bridgelabz.regex;

public class MoodAnalyzer {

	private String message;
	
    public String analyseMood(String message) {
        if(message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
        
    }
    
}