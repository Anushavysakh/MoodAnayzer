package com.day21exceptionassignment.bridgelabz;

public class MoodAnalyserUc1 {

	public String analyseMood(String message) {

	        if (message.contains("sad"))
	            return "SAD";
	        else
	            return "HAPPY";
   }
}