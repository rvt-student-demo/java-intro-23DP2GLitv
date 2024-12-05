package lv.rvt;

public class HealthStation {
    int weight = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weight++;
        return person.getWeight();
}

    public void feed(Person person){
        person.setWeight();
    }

    public int weighings() {
        return this.weight;
    }
}
