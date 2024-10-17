package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int val = rand.nextInt(10) + 1;
        int three_try = 3;
        
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:  ");
        
        while (true) {
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == val) {
                System.out.println("RIGHT!");
                System.out.println("You have won the game.");
                break;
            }
            else {
                three_try--;
                if (three_try == 0) {
                    System.out.println("wrong.");
                    System.out.println("The correct number was " + val + ".");
                    System.out.println("You have lost the game.");
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

    

