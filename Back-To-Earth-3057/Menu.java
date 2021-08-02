import greenfoot.*;  

/**
 * Esta es la clase Menu.
 * 
 * Autor: Renatto Guzmán 
 * 2/08/2021
 */
public class Menu extends World
{
    public Menu()
    {   
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        addObject(new Start(), 450, 250 );
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }   
}
