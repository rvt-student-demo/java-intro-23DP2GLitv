package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        int sum = 0;
        int numsum = 0;
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            numsum = numsum + 1;
            sum = sum + number;
            
        } 
        System.out.println("Number of numbers: " + numsum);
        System.out.println("Sum of the numbers: " + sum);
}
}

    

