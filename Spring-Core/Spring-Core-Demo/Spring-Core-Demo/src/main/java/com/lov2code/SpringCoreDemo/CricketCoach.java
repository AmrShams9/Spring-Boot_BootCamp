package com.lov2code.SpringCoreDemo;

import org.springframework.stereotype.Component;
//Makes it available for dependency injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {

        return "Practice Fast Bowling for 15 minutes!!!!!";
    }
}
