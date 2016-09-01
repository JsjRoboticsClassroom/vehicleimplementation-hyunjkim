package nyc.c4q.abassawo;

/**
 * Created by Hyun on 8/31/16.
 */
public class Bicycle implements Vehicle,WheeliaAble {

    double initialSpeed;

    public Bicycle(double initialSpeed){
        this.initialSpeed = initialSpeed;
    }


    @Override
    public void applyBrakes(int number) {
        System.out.println("this is applying brakes");
    }

    @Override
    public void speedUp(int delta){
        if (delta < 50){
            System.out.println("Bicycle is not speeding");
        }
        slowDown(delta);
    }

    @Override
    public void slowDown(int delta){
        if(delta > 50){
            System.out.println("slow down bicycle");
        }
        speedUp(delta);

    }

    @Override
    public void popawheelie(int duration) {
        while (duration != 0){
            System.out.println("this is a durations");
            duration--;
        }
    }
}
