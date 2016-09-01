package nyc.c4q.abassawo;

/**
 * interface, you cannot create a body
 */
public interface Vehicle {

    // parts that vehicles share

    void applyBrakes(int number);
    void speedUp(int delta);
    void slowDown(int delta);       // takes a parameter
    void popawheelie(int duration);
}
