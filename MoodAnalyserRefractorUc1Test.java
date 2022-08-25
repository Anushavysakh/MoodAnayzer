package com.day21exceptionassignment.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserRefractorUc1Test {

	 @Test
	    public void testMoodAnalysis_whenMoodIsSad() {
		 MoodAnalyserRefractorUc1 moodAnalyzer = new MoodAnalyserRefractorUc1("This is a sad message");
	        String mood = moodAnalyzer.analyseMood();
	        Assertions.assertEquals(mood,"SAD");
	    }

	    @Test
	    public void testMoodAnalysis_whenMoodIsHappy() {
	    	MoodAnalyserRefractorUc1 moodAnalyzer = new MoodAnalyserRefractorUc1("This is a happy message");
	        String mood1 = moodAnalyzer.analyseMood();
	        Assertions.assertEquals(mood1,"HAPPY");

	    }

}
