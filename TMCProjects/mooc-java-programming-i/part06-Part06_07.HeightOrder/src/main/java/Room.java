import java.util.ArrayList;

public class Room {
    ArrayList<Person> personArrayList;

    public Room() {
        personArrayList = new ArrayList<>();
    }

    public void add(Person person) {
        personArrayList.add(person);
    }

    public boolean isEmpty() {
        return personArrayList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personArrayList;
    }

    public Person shortest() {
        if(personArrayList.isEmpty()) {
            return null;
        } else {
            Person shortest = personArrayList.get(0);
            for (Person p : personArrayList) {
                if(p.getHeight() < shortest.getHeight()) {
                    shortest = p;
                }
            }
            return shortest;
        }
    }

    public Person take() {
        if(personArrayList.isEmpty()) {
            return null;
        } else {
            Person s = shortest();
            personArrayList.remove(s);
            return s;
        }
    }
}
