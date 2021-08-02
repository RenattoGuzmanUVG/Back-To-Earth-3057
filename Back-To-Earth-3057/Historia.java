import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class historia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Historia extends Actor
{
    private GreenfootImage im1, im2, im3, im4;
    boolean otro = true;
    public Historia()
    {
         im1 = new GreenfootImage("im1.png");
         im2 = new GreenfootImage("im2.png");
         im3 = new GreenfootImage("im3.png");
         im4 = new GreenfootImage("im4.png");
         setImage(im1);
    }
    public void act()
    {
        cambio();
    }
    public void cambio()
    {   //GreenfootSound song = new GreenfootSound("cinematica-song.wav");
        if (Greenfoot.isKeyDown("right"))
        {   //song.play();      
    
            if(getImage() == im1)
               setImage(im2);
            
        }
        
        if (Greenfoot.isKeyDown("down"))
        {   if(getImage() == im2)
                setImage(im3);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {   if(getImage() == im3)
                setImage(im4);
        }
        
        }   
}