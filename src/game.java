/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = input.nextLine();  // Get user input
        System.out.println("Nice, to meet you " + name + "!");

        int number = rand.nextInt(100) + 1;
        System.out.println("number is " + number);

        int trycount = 0;
        while(true){
            System.out.println("Enter your guess(1-100):");

            //int playerGuess = scanner.nextInt();


            int playerGuess = 0;
            try {
              playerGuess = scanner.nextInt();
            } catch (Exception e) {
                //input.nextLine();
                System.out.println("That's not an integer, enter " + number);
            continue;
            }
            trycount++;

            if (playerGuess == number) {
                System.out.println("Correct! you win!");
                System.out.println("You had " +  trycount + "tries!");
                break;
            } else  if (number > playerGuess) {
                System.out.println("Nope, the number is higher. guess again!");
            } else {
                System.out.println("Nope, the number is lower. guess again!");
            }
        }

        scanner.close();
    }
}

//tried to use try and catch for some odd reason would not work
/*
try {
                System.out.println("Enter your guess(1-100):");
            } catch (Exception e) {
                input.nextLine();
                System.out.println("That's not an integer, enter " + number);
            }
 */