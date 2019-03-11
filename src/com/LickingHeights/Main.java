package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pickedNumber;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);

        System.out.println("Guess a number between 1 and 100");
        int guess1;
        guess1 = keyboard.nextInt();

    }
}
