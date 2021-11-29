package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String msg;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String msg){
        this.msg = msg;
    }

    public String analyzeMood() throws MoodAnalyzeException{
        try {
            if(msg.contains("Sad")){
                return "Sad";
            }
            return "Happy";
        }catch (NullPointerException e){
            return "Happy";
        }
    }
}