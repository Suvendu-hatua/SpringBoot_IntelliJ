package com.java.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Lazy
public class TennisCoach implements  Coach{
    public TennisCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String performWorkOut() {
        return "Play Tennis Ball for 1 hour daily.";
    }
}
