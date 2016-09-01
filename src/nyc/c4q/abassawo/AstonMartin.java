package nyc.c4q.abassawo;
/**
 * Created by Hyun on 8/31/16.
 */
public class AstonMartin implements Vehicle {

    double initialSpeed = 0.0;

    public AstonMartin(double initialSpeed){
        this.initialSpeed = initialSpeed;
    }

    @Override
    public void applyBrakes(int number) {
        System.out.println("this is AstonMartin");
    }

    @Override
    public void speedUp(int delta){
        if (delta > 80) {
            System.out.println("AstonMartin slow down");
        }

        slowDown(delta);
    }

    public void slowDown(int delta){
        System.out.println("slow down there!");

    }

    @Override
    public void popawheelie(int duration) {
        while (duration != 0){
            System.out.println("this is a durations");
            duration--;
        }
    }
}
