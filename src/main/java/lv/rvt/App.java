package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class App 
{
    public static void main( String[] args) throws Exception
    {
        BufferedReader reader = Utils.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();
        
        double average = 0;
        String line;
        reader.readLine();


        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            /* System.out.println("Array: " + Arrays.toString(parts)); */
            Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            /* System.out.println("CSV line: " + line); */
            persons.add(person);
        }
        for (Person person : persons) {
            System.out.println(person);
            average = average + person.returnAge();
        }
        System.out.println("Average age: " + average / 4);


  
}
                  
}
    


    

