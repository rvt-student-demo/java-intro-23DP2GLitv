package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            sum = sum + number;
            numbers++;
            if (number % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }


        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double)sum / numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
}
}

    

