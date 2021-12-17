package com.bridgelabz.regex;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {

  MoodAnalyzer moodAnalyzer = new MoodAnalyzer(); 

  //should return HAPPY
@Test
public void MoodAnalyzer_HAPPYTest() {
	String message = moodAnalyzer.analyseMood("HAPPY");
	String message2 = moodAnalyzer.analyseMood("I am in any mood");
	Assert.assertEquals("HAPPY", message);
}

//should return SAD 
@Test
public void MoodAnalyzer_SADTest() {
	String message = moodAnalyzer.analyseMood("SAD");
	String message2 = moodAnalyzer.analyseMood("I am in sad mood");
	Assert.assertEquals("SAD", message);
}


}