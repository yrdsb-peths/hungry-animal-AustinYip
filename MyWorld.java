import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        Bee b1 = new Bee();
        addObject(b1,300,350);
        createApple();
    }
    
    public void createApple()
    {
        fries food2 = new fries();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(food2, x, y);
    }
}
