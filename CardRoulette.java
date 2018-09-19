/*
* The java version of what I want to build.
*/

import java.util.Scanner;
import java.util.Random;

public class CardRoulette {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Credit Card Roulette");
        System.out.print("Number of People: ");
        int numPeople = input.nextInt();
        int [] arr = new int[numPeople];
        System.out.print("Bill Total: ");
        int billTotal = input.nextInt();
        
        for (int i = 0; i < numPeople-1; i++) {
            int rando = randomNumberInRange(1, billTotal);
            arr[i] = rando;
            billTotal = billTotal - rando;
        }
        arr[numPeople-1] = billTotal;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Person " + i + ": $" + arr[i]);
        }

    }

    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}