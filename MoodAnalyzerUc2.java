package com.day21exceptionassignment.bridgelabz;

public class MoodAnalyzerUc2 {

	private String message;

	public MoodAnalyzerUc2() {

	}

	public MoodAnalyzerUc2(String message) {
		this.message = message;
	}

	public String analyseMood() {

		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			return "HAPPY";

		}
	}

}
