package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int round = 0;
        int guessed = 0;
        int end = 0;

        while (true) {
            int val = rand.nextInt(10) + 1;
            int three_try = 3;
            round++;
            System.out.println("round " + round + ":");
            System.out.println("");
            System.out.println("I am thinking of a number from 1 to 10.");
            System.out.println("You must guess what it is in three tries.");
            System.out.println("Enter a guess: ");
            if (end == 1) {
                break;
            }
            while (true) {
                int guess = Integer.valueOf(scanner.nextLine());
            if (guess == val) {
                System.out.println("RIGHT!");
                guessed++;
                System.out.println("You have won " + guessed + " out of " + round + " rounds.");
                break;
            }
            if (round == 10) {
                System.out.println("You have won " + guessed + " out of 10 rounds.");
                if (guessed <= 7) {
                    System.out.println("Your rating: amateur.");
                }
                else if (guessed == 8) {
                    System.out.println("Your rating: advanced.");
                }
                else if (guessed == 9) {
                    System.out.println("Your rating: professional.");
                }
                else if (guessed == 10) {
                    System.out.println("Your rating: hacker.");
                }
                end = 1;
            }
            else {
                three_try--;
                if (three_try == 0) {
                    System.out.println("wrong.");
                    System.out.println("The correct number was " + val + ".");
                    System.out.println("You have won " + guessed + " out of " + round + " rounds.");
                    break;
                }
                else if (guess - val >=  3 || guess - val <= -3) {
                    System.out.println("cold");
                }
                else if (guess - val == 2 || guess - val == -2) {
                    System.out.println("warm");
                }
                else if (guess - val == 1 || guess - val == -1) {
                    System.out.println("hot");
                }
            } 
        
        }
        
        
            }
                  
}
    
}

    

