package com.day21exceptionassignment.bridgelabz;

import org.junit.jupiter.api.Assertions;

public class MoodAnalyserRefractorUc1 {



    private String message;

    //Default Constructor
    public MoodAnalyserRefractorUc1() {
    }

    //Parameterized Constructor
    public MoodAnalyserRefractorUc1(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
