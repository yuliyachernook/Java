import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    private int carId;
    private int timeToStaying;
    private int timeToWait;
    private Semaphore sem;

    public Car(int carId, Semaphore sem, int timeToStaying, int timeToWait) {
        this.carId = carId;
        this.sem = sem;
        this.timeToStaying = timeToStaying;
        this.timeToWait = timeToWait;
    }

    public int getCarId() {
        return carId;
    }

    public void run(){
        try {
            System.out.printf("The car %d  is waiting for a place\n", carId);
            if(sem.tryAcquire(this.timeToStaying, TimeUnit.SECONDS)) {

                System.out.printf("The car %d take the place\n", carId);

                sleep(timeToWait * 1000);

                System.out.printf("The car %d has left its place\n", carId);

                sem.release();
            }
            else{
                System.out.printf("The car %d left the parking without waiting\n", carId);

            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
