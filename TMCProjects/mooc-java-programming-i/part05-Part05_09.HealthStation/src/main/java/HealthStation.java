
public class HealthStation {

    private int numOfWeighs = 0;

    public int weigh(Person person) {
        numOfWeighs++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return numOfWeighs;
    }

}
