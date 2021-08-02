import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{   int score = 0;
    
    public Counter()
    {
        setImage(new GreenfootImage("Puntos: " + score, 40, Color.GREEN, Color.BLACK));
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Puntos: " + score, 40, Color.GREEN, Color.BLACK));
    }    
        
    public void addScore()
    {
        score++;
    }
    

    //public void images()
    //{
        //if (score > 5)
        //{
           // setImage(new GreenfootImage())
       // }
    //}
}   

