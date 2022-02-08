package com.careerdevs.sayhello;

import java.util.Scanner;

public class SayHello {
    public static void main(String [] args){
        //write code here
        //make scanner to read user input
        Scanner scanner = new Scanner(System.in);

        //now ask the user a question
        System.out.println("What is your name?");

        //read users input, and store it in a variable
        String userName = scanner.nextLine();

        //display message with user input
        System.out.println("Nice to meet you " + userName);

    }
}
