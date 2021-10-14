import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Player1 player1;
    private Player2 player2;
    /**
     * Constructor for objects of class MyWorld. Sets spawn points for 
     * the objects in the world as well as tells my paddles what buttons
     * are used to control them
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        
        addObject(new paddle("w", "s"), 0, 200);
        addObject(new paddle("up", "down"), 599, 200);
        
        Ball ball = new Ball();
        addObject(ball, getWidth()/2, getHeight()/2);
        
        player1 = new Player1();
        addObject(player1, 119, 26);
        
        player2 = new Player2();
        addObject(player2, 599, 26);
    }
    /**
     * tells player one to add a score
     */
    public void score1()
    {
        player1.addScore();
    }
    /**
     * tells player two to add a score
     */
    public void score2()
    {
        player2.addScore();
    }
}
