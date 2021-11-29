package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

/**
 *Ability to analyze and respond Happy or Sad Mood
 */

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy",mood);
    }
}