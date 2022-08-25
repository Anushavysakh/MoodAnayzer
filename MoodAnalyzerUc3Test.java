package com.day21exceptionassignment.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class MoodAnalyzerUc3Test {

	  public void givenMessageWhenSadShouldReturnSad() throws MoodAnalysisException {

		    MoodAnalyzerUc3 moodAnalyzer = new MoodAnalyzerUc3("I am in Sad Mood");
	        try {
	            String actualResult = moodAnalyzer.analyseMood();
	            Assert.assertEquals("Sad", actualResult);
	        } catch (MoodAnalysisException e) {
	            System.out.println(e);
	        }
	    }

	    // Test case to check happy mood
	    @Test
	    public void givenMessageWhenHappyShouldReturnHappy() throws MoodAnalysisException {

	        MoodAnalyzerUc3 moodAnalyzer = new MoodAnalyzerUc3("I am in Happy Mood");
	        try {
	            String actualResult = moodAnalyzer.analyseMood();
	            Assert.assertEquals("Happy", actualResult);
	        } catch (MoodAnalysisException e) {
	            System.out.println(e);
	        }
	    }

	    // Test case to check empty mood
	    @Test
	    public void givenMessageWhenEmptyThrowsException() {

	        MoodAnalyzerUc3 moodAnalyzer = new MoodAnalyzerUc3();
	        try {
	            String actualResult = moodAnalyzer.analyseMood();
	            Assert.assertEquals("Happy", actualResult);
	        } catch (MoodAnalysisException e) {
	            System.out.println(e);
	        }
	    }
	}
	
	
	
	