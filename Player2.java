import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    private int score;
    
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public Player2()
    {
        score = 0;
        setImage(new GreenfootImage (200, 30));
        Player2();
    }
    /**
     * Setting the image of the counter
     */
    public void Player2()
    {
        GreenfootImage player2 = getImage();
        player2.clear();
        player2.setColor(Color.WHITE);
        player2.drawString("Player 2: " + score, 4, 20);
    }
    /**
     * used to add score and check for a win.
     */
    public void addScore()
    {
        score++;
        Player2();
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
