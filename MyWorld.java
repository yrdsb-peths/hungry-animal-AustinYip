import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        bee b1 = new bee();
        addObject(b1,300,350);
        
        fries food1 = new fries();
        addObject(food1, 300, 0);
        
    }
}
