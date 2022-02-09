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
        System.out.println(userFirstName + " " + userLastName + " it is nice to meet you");
    }

    public static void fName(){
        //need a new scanner
        Scanner scanner = new Scanner(System.in);

        //ask a question
        System.out.println("What is your first name?");

        //read and make input a variable
        String userFName = scanner.nextLine();

        //ask another question
        System.out.println("What is your last name?");

        //read and input
        String userLName = scanner.nextLine();

        //output both
        System.out.println(userFName + " " + userLName + "is it nice to meet you!");
    }
}