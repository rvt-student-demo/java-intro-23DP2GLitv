package lv.rvt;

public class Agent {
    private String name;
    private String lastName;
    
    public Agent(String name, String lastName) {
        this.name = name;
        this.lastName = lastName; 
    }

    public String toString() {
        return "My name is " + this.lastName + ", " + this.name + " " + this.lastName;
    }
}
