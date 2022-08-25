package com.day21exceptionassignment.bridgelabz;

public class MoodAnalyzerUc3 {

	public static String message;

    public MoodAnalyzerUc3() {
    }

    public MoodAnalyzerUc3(String message) throws MoodAnalysisException {
        this.message = message;
        analyseMood();
    }

    public static String analyseMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid mood");
        }

    }

}


