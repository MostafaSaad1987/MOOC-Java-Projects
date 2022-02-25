
public class Fitbyte {
    private int age, resettingHR;

    public Fitbyte(int age, int resettingHR) {
        this.age = age;
        this.resettingHR = resettingHR;
    }

    public double targetHeartRate(double targetHR) {
        double result = (maximumHR(this.age) - resettingHR) * (targetHR) + resettingHR;
        return result;
    }

    public double maximumHR(int age) {
        return 206.3 - (0.711 * age);
    }
}
