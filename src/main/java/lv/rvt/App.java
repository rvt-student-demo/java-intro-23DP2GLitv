package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        if (end == 0) {
            System.out.println("Factorial: " + fact);
        }
        else {
            for (int i = 1; i < end + 1; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
        }
        
}
}

    

