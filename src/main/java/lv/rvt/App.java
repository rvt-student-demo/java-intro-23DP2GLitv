package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App 
{
    public static void main( String[] args) throws Exception
    {
        BufferedWriter writer = Helper.getWriter("data.csv", StandardOpenOption.APPEND);
        Person person = new Person("Maksims", 78, 900, 10);
        person.toCsvRow();
        writer.newLine();
        PersonManager.addPerson(person);

  
}
                  
}
    


    

