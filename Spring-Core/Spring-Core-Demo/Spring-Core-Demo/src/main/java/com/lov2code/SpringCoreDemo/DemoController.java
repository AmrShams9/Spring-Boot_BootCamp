package com.lov2code.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
    //Create A Constructor for Injections
    //define a private field for the dependency
    private Coach myCoach;
    //define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach){

        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDalyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
