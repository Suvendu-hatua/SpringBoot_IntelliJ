package com.java.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Lazy
public class FootballCoach implements Coach{
    public FootballCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String performWorkOut() {
        return "Play Football for 90 minutes.";
    }
}
