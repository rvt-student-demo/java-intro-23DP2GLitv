package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class App 
{
    public static void main( String[] args) throws Exception
    {
        ArrayList<Person> persons = PersonManager.getPersonList();
        for (Person person : persons) {
            System.out.println(person);
        }


  
}
                  
}
    


    

