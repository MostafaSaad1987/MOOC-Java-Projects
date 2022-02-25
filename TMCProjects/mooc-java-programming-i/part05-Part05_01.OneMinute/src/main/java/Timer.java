
public class Timer {
    private int hundSec;
    private int sec;
    private int min;

    public Timer() {
        this.hundSec = 0;
        this.sec = 0;
        this.min = 0;
    }

    public void advance() {
        hundSec++;
        if (hundSec >= 100) {
            sec++;
            hundSec = 0;
            if (sec >= 60) {
                sec = 0;
                min++;
            }
        }
    }

    @Override
    public String toString() {
        if (sec < 10) {
            if (hundSec < 10) {
                return "0" + sec + ":" + "0" + hundSec;
            }
            return "0" + sec + ":" + hundSec;
        }
        if (hundSec < 10) {
            return sec + ":" + "0" + hundSec;
        }
        else{
            return sec + ":" + hundSec;
        }
    }
}
