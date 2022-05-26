import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fries object
 * 
 * @author Austin Yip
 * @version May 2022
 */
public class fries extends Actor
{
    static int speed = 1;
    /**
     * Act - do whatever the fries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y+2);
        
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }    
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}
