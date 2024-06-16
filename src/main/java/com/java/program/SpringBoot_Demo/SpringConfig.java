package com.java.program.SpringBoot_Demo;

import com.java.common.BadmintonCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public BadmintonCoach setCoach(){
        BadmintonCoach coach=new BadmintonCoach();
        return coach;
    }
}
