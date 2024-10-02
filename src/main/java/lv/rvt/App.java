package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i < number + 1; i++) {
            printText();
        }

        
}
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
}
    
}

    

