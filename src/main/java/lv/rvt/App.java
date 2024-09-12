package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int secondnumber = Integer.valueOf(scanner.nextLine());

        System.out.println(firstnumber + " + " + secondnumber + " = " + (firstnumber + secondnumber));


    }
}
