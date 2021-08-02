import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Esta es la clase MyWorld.
 * 
 * Autor: Renatto Guzmán 
 * 2/08/2021
 */
public class MyWorld extends World
{   
    double contadorEnemigos = 0.001; 
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }
        
    public void act ()
    {   
        contadorEnemigos++;
        if (60 - contadorEnemigos<17)
        {
                    anadirAsteroides();
                    contadorEnemigos = 0;
        }
    }
    public Counter getCounter()
    {
        return counter;
    }
    public void anadirAsteroides()
    {
        addObject(new Asteroide(), 597, 1+ Greenfoot.getRandomNumber(398));
    }
    private void prepare()
    {
        Cohete cohete =  new  Cohete();
        addObject(cohete, 76, 210);
        addObject(counter, 75, 23);
    }    
}
