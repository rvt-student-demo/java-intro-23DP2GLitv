package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

        
}
    public static void divisibleByThreeInRange(int beggining, int end) {
        for (int i = beggining; i < end + 1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
}
    
}

    

