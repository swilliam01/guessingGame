package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
      int num;

                System.out.println("I have guessed a number between 1 and 10. Try to guess");
                num = keyboard.nextInt();

                while (num != 6)
                {
                    System.out.println("That is incorrect. Guess again !");
                    num = keyboard.nextInt();
           }
        System.out.println( "That's right! You are a good guesser");



                   }
       }








