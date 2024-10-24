package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Person ada = new Person("Ada");
        Person maksims = new Person("Maksims");

        Product Banana = new Product("Banana", 1.1, 13);
        
        ada.printPerson();
        maksims.printPerson();
        System.out.println("");

        Banana.printProduct();

}
                  
}
    


    

