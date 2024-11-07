package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        System.out.println("Enter numbers: ");
        int odd = 0;
        int even = 0;
        while (true) {
            int skaitlis = Integer.valueOf(scanner.nextLine());
            
            if (skaitlis == -1) {
                break;
            }

            else {
                statistics.addNumber(skaitlis);
                if (skaitlis % 2 == 0) {
                    odd = odd + skaitlis;
                }
                else {
                    even = even + skaitlis;
                }
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of odd numbers: " + odd);
        System.out.println("Sum of even numbers: " + even);
    
}
                  
}
    


    

