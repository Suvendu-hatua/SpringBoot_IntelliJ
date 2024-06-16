package com.java.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String performWorkOut() {
        return "Practise Swimming for 30 minutes daily.";
    }
}
