package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("""
                    Would you like to hear a quote?
                    (1-10) Pick a number to see a quote or...
                    (0) Pick a random quote
                    (X) Exit program
                    """);

            String choice = input.nextLine().trim();

            if (1 <= Integer.parseInt(choice) && Integer.parseInt(choice) <= 10) {
                System.out.println(quotes[Integer.parseInt(choice) - 1]);
            } else if (Integer.parseInt(choice) == 0) {
                System.out.println(quotes[(int) (Math.random() * 10 + 1)]);
            } else if (choice.charAt(0) == 'X') {
                System.out.println("Exiting....");
                isRunning = false;
            }

        }

    }


}


}
