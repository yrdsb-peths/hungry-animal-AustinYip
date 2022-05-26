import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Main World
 * 
 * @author Austin Yip
 * @version May 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(0, 80);
    int level = 1;
    public MyWorld()
    {   
        //create the world and spawn bee/fries
        super(600, 400, 1, false); 
        Bee b1 = new Bee();
        addObject(b1,300,350);
        createFries();
        // create a label
        addObject(scoreLabel,50, 50);
    }
    /*
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if (score%5 == 0)
        {
            level += 1;
        }
    }
    public void createFries()
    {
        //spawn fries at random location
        fries food2 = new fries();
        fries.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(food2, x, y);
    }
    
    /*
     * end the game draw game over
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject (gameOverLabel, 300, 200);
    }
}
