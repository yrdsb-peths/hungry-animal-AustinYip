import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * bee main character
 * 
 * @author Austin Yip
 * @version May 2022
 */
public class Bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound("Bee-noise.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    // direction the bee is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Bee()
    {
        for (int i = 0; i<idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/bee_idle/idle"+i+".png");
            idleRight[i].scale(120,120);
        }
        
        for (int i = 0; i< idleLeft.length;i++)
        {
            idleLeft[i] = new GreenfootImage("images/bee_idle/idle"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(120,120);
        }
        animationTimer.mark();
        //initial bee image
        setImage(idleRight[0]);
    }
    
    /*
     * animate elephant
     */
    int imageIndex = 0;
    public void animateBee()
    {
        if(animationTimer.millisElapsed()<100)
        {
            return;
        }
        if (facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "left";
        }
        eat();
        
        animateBee();
    }    

    public void eat()
    {
        if (isTouching(fries.class))
        {
            removeTouching(fries.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFries();
            world.increaseScore(); 
            beeSound.play();
        }
    }
}
