package com.careerdevs.asktheuser;

public class User {
    //define set of fields that apply to the user
    //create constructor
    //create getters & setters
    //create a toString method or an override method
    private String name;
    private int age;
    private String dob;

    //create constructor
    public User(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    //generate getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //toString

    @Override
    public String toString() {
        return "Hello, " + name + ". You were born " + dob + " making you " + age + " years old.";
    }
}
