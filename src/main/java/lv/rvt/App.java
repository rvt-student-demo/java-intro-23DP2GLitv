package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int val = rand.nextInt(10) + 1;
        int five_try = 5;
        
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("Try to guess the number.");
        System.out.println("Your beginning score is 5 points.");
        System.out.println("Each time you guess wrong, your score is decreased by one.");
        System.out.print("Enter a guess: ");
        
        while (true) {
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == val) {
                System.out.println("You WON the game.");
                break;
            }
            else {
                five_try--;
                System.out.println("Too Low! Your score is now " + five_try);
                if (five_try == 0) {
                    System.out.println("You lost.");
                    break;
                }
            }
            
        
        }
        System.out.println("Your score is " + five_try);
        


        

        
}
    
}

    

