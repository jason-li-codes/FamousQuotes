package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    // created public scanner outside of main method
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // initializes quotes String array with 10 quotes
        String[] quotes = {
                "The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
                "In the middle of difficulty lies opportunity. – Albert Einstein",
                "Be yourself; everyone else is already taken. – Oscar Wilde",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
                "The best way to predict the future is to invent it. – Alan Kay",
                "Do what you can, with what you have, where you are. – Theodore Roosevelt",
                "Life is what happens when you're busy making other plans. – John Lennon",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky",
                "Whether you think you can or you think you can’t, you’re right. – Henry Ford",
                "The journey of a thousand miles begins with one step. – Lao Tzu"
        };

        // creates isRunning boolean to create looping menu
        boolean isRunning = true;

        // while loop
        while (isRunning) {

            // begins by printing main menu
            System.out.println("""
                    Would you like to hear a quote?
                    (1) Pick a number to see a quote or...
                    (2) Pick a random quote
                    (3) Exit program
                    """);

            // takes in user input for menu choice, with line eating buffer
            int choice = input.nextInt();
            input.nextLine();

            // contains all menu choice outputs in try case
            try {
                // begins with a switch case looking at int choice
                switch (choice) {
                    // in case 1, prints appropriate quote from 1-10 using index using input again
                    case 1:
                        System.out.println("Pick a number from 1-10.");
                        int quoteNum = input.nextInt();
                        // eats buffer
                        input.nextLine();
                        System.out.println(quotes[quoteNum - 1]);
                        break;
                    // in case 2, print quote using random index from 0-9
                    case 2:
                        System.out.println(quotes[(int) (Math.random() * 10)]);
                        break;
                    // in case 3, exits program by changing isRunning to false
                    case 3:
                        System.out.println("Exiting....");
                        isRunning = false;
                        break;
                }
            // catches exception
            } catch (Exception e) {
                // if input for choice or quoteNum is a number out of bounds or a string, catches exception
                System.out.println("You have entered an invalid input. Try again.");
                e.printStackTrace();
            }

        }

    }

}
