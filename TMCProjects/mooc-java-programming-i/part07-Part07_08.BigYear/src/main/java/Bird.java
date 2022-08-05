public class Bird {
    String name;
    String latinName;
    int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void addObservations() {
        this.observations++;
    }
}
