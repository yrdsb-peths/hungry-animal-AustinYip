import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        if(isTouching(fries.class))
        {
            removeTouching(fries.class);
        }
    }    
}
