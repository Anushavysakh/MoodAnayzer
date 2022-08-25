package com.day21exceptionassignment.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserUc1Test2 {

	@Test
	void testAnalyseMood_whenMoodisSad() {

		MoodAnalyserUc1 obj = new MoodAnalyserUc1();
	
		String mood = obj.analyseMood("This is a sad message");
		Assertions.assertEquals(mood, "SAD");
		
	}
	
	@Test
	void testAnalyseMood_whenMoodisHappy() {

			MoodAnalyserUc1 obj = new MoodAnalyserUc1();
		
			String mood = obj.analyseMood("This is a happy message");
			Assertions.assertEquals(mood, "HAPPY");
			
	}
}
