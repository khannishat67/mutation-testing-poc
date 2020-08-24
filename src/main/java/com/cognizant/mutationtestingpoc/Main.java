package com.cognizant.mutationtestingpoc;

public class Main {
    private String greeting;

    public Main(String greeting) {
        this.greeting = greeting;
    }
    public String greet(String name) {
        if (name != null && !name.equals("")) {
            return new StringBuilder(this.greeting).append(name).toString();
        } else {
            return new StringBuilder(this.greeting).append("World").toString();
        }
    }
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
