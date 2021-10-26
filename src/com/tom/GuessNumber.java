package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int HideNumber = random.nextInt(10) + 1;
        System.out.println(HideNumber);
        System.out.println("Please enter your number(1-10)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("User: " + string);
        int number = Integer.parseInt(string);
        if (number > HideNumber){
            System.out.println("Smaller");
        }else if (number < HideNumber){
            System.out.println("Bigger");
        }else if(number == HideNumber){
            System.out.println("Bingo!");
        }

    }
}
