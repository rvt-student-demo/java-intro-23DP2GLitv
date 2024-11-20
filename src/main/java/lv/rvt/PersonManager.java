package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class PersonManager {
    public static ArrayList<Person>getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();

        String line;
        reader.readLine();


        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persons.add(person);
    }
    return persons;
}
}
