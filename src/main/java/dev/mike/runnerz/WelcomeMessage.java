package dev.mike.runnerz;

import org.springframework.stereotype.Component;


@Component
public class WelcomeMessage {



    public String welcomeMessage(){
        return "Welcome to the springboot application";
    }
}
