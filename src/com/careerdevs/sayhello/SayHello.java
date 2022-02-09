package com.careerdevs.sayhello;

import java.util.Scanner;

public class SayHello {
    public static void main(String [] args){
        //write code here
        //make scanner to read user input
        Scanner scanner = new Scanner(System.in);

        //now ask the user a question
        System.out.println("What is your first name?");

        //read users input, and store it in a variable
        String userFirstName = scanner.nextLine();

        //now ask for last name
        System.out.println("What is your last name?");

        //variable for user last name
        String userLastName = scanner.nextLine();

        //display message with user input
        System.out.println(userFirstName);
        System.out.println("Your last name is " + userLastName);
        System.out.println(userFirstName + userLastName + " it is nice to meet you");
    }
}
