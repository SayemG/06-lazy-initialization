package com.luv2code.springcoredemo.commom;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice your backend volley!" ;
    }
}
