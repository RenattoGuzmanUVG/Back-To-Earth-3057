import greenfoot.*;  
/**
 * Esta es la Clase de Cinemáticas.
 * 
 * Autor: Renatto Guzmán 
 * 2/08/2021
 */
public class Cinematicas extends World
{
    public Cinematicas()
    {    
        super(600, 400, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Historia(), 300, 200);
        Greenfoot.playSound("cinematica-song.wav");        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.setWorld(new Menu());   
        }
    }
}
