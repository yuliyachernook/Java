import java.util.Random;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {

        Semaphore places = new Semaphore(3);
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            new Car(i, places, Math.abs(rand.nextInt() % 10), Math.abs(rand.nextInt() % 10)).start();
        }
    }
}