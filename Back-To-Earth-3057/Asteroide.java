import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Asteroide extends Actor
{

    /**
     * Act - do whatever the Asteroide wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()   
    { 
        move(-2);
        
        moverAsteroide();
        disparado(); 
        
    }
    
    
    
    public void moverAsteroide()
    {
        if(isAtEdge())
        {
                setLocation(590,getY());// Teletransporta los 
        }   
    }
    
    public void disparado()
    {   
        
        Actor disparo = getOneIntersectingObject(Disparo.class);
        
        if (disparo != null)
        {
                
            
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();//añade los puntos al contador cuando se destruye un asteroide  
            
            getWorld().removeObject(disparo);//Elimina a los disparos al tocarlos
            getWorld().removeObject(this);//Elimina a los asteroides al tocarlos
            Greenfoot.playSound("explosion.wav");
        }
    }
    
}
