import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bee extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
    }    
    
    public void eat()
    {
        if (isTouching(fries.class));
        {
            removeTouching(fries.class);
        }
        
        
    }
}
