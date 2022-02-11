package com.careerdevs.sayhello;

import java.util.Scanner;

public class SayHello {
    public static void main(String [] args){
        fullName();
    }

    public static void fullName(){
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