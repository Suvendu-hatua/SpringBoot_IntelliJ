package com.java.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String performWorkOut() {
        return "do batting for 30 min and bowling for 1 hour.";
    }
}
