import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Disparo extends Actor
{

    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        move(5);
        borrarDelMapa();
        
    }
    

    public void borrarDelMapa()
    {   

        if(isAtEdge())
            getWorld().removeObject(this); //Esto borra al disparo cuando llega al borde del mapa
          
    }
    
    
}
