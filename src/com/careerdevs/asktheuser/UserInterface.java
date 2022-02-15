package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        //ask name
        //ask age
        //ask date of birth
        userInterface();//calls user interface below
    }
    public static void userInterface() {

        Scanner scanner = new Scanner(System.in);//create scanner

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("What is your age?");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your day of birth?");
        String userDOB = scanner.nextLine();

        //define user variable
        User generatedUser = new User(userName,userAge,userDOB);

        System.out.println(generatedUser);
    }
}
//take user input and create an instance of the User class using that data
