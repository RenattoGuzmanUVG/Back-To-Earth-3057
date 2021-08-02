import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Cohete extends Actor
{
    boolean puedeDisparar = true;
    
    public void act()
    {
        movimientoCohete();
        disparar();
        gameOver();
    }

    public void movimientoCohete()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 5);
            
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 5);
        }
    }

    public void disparar()
    {
        World w = getWorld();
        
        if (Greenfoot.isKeyDown("space") && puedeDisparar == true)
        {
            w.addObject( new  Disparo(), getX()+70, getY());
            Greenfoot.playSound("pew.mp3");
            puedeDisparar = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
                puedeDisparar = true;
        }
    }
    
    public void gameOver()
    {
        Actor asteroide = getOneIntersectingObject(Asteroide.class);
        
        if (asteroide != null)
        {   
            World w = getWorld();
            
            GameOver gameover = new GameOver();
            Greenfoot.playSound("game-over.wav");
            w.addObject(gameover, 300, 200);
            
            w.removeObject(this);
            //w.removeObject(asteroide);
        }
    }
}
