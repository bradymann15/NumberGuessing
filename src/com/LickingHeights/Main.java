package com.LickingHeights;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int pickedNumber;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);

        System.out.println("Guess a number between 0 and 100");
        int guess1;
        guess1 = keyboard.nextInt();
        guess(pickedNumber,guess1);
        System.out.println("Guess again! Two more left!");
        guess1= keyboard.nextInt();
        guess(pickedNumber,guess1);
        System.out.println("Guess again! One more guess!");
        guess1= keyboard.nextInt();
        guess(pickedNumber,guess1);
        System.out.println("Sorry, but the number was "+pickedNumber+". Thanks for playing!");




        }
    public static void guess(int pickedNumber, int guess1){
        if (pickedNumber>guess1){
             System.out.println("Incorrect! The number you guessed is too small");
        }
        else if (pickedNumber<guess1){
            System.out.println("Incorrect! The number you guessed is too big");
        }
        else {
            System.out.println("Correct! The number was "+pickedNumber+". Thanks for playing!");
            System.exit(0);

        }
    }
}



