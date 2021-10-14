import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    private int score;
    
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1()
    {
        score = 0;
        setImage(new GreenfootImage (200, 30));
        player1();
        checkForWin();
        
    }
    /**
     * Setting the image of the counter
     */
    public void player1()
    {
        GreenfootImage player1 = getImage();
        player1.clear();
        player1.setColor(Color.WHITE);
        player1.drawString("Player 1: " + score, 4, 20);
    }
    /**
     * used to add score and check for a win.
     */
    public void addScore()
    {
        score++;
        player1();
        checkForWin();
    }
    /**
    * When the score hits 8 the program stops running
    */
    public void checkForWin()
    {
        if(score >= 8)
        {
            Greenfoot.stop();
        }
    }
}
