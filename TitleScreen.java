import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Austin Yip
 * @version May 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Bee",60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 150, 150);
        prepare();
    }

    /**
     * main world act loop to check if space is down
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,458,115);
        bee.setLocation(434,195);
        Label label = new Label("Press \u2190 and \u2192 to move", 40);
        addObject(label,250,250);
        label.setLocation(200,230);
        Label label2 = new Label("Press space to start", 30);
        addObject(label2,277,353);
        label.setLocation(200,208);
        bee.setLocation(450,104);
        label2.setLocation(135,366);
    }
}
