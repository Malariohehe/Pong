import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 5;
    private int dY = 3;
    private int time = 0;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move();
       checkForBounce();
       checkForScore1();
       checkForScore2();
       time++;
       checkForCollision();
    }
    /**
     * Tells the ball how fast to move
     */
    public void move()
    {
        if(time >= 100)
        {
           setLocation(getX() + dX, getY() + dY); 
        }
    }
    /**
     * Tells the ball that if it is touching the paddle it needs to "bounce"
     * by switching its X to the opposite sign
     */
    public void checkForBounce()
    {
        if (getX() <= 0 || getX() >= 599)
        {
            dX = -dX; 
        }
        if (getY() <= 0 || getY() >= 399)
        {
            dY = -dY;
        }
        if(isTouching(paddle.class))
        {
            dX = -dX;
        }
    }
    /**
     * tells the ball if it hits a specific part of the paddle to speed up
     * to avoid sticky paddles
     */
    public void checkForCollision()
    {
        if(isTouching(paddle.class) && getX() <= 99)
        {
            dX = 10;
            move();
            dX = 5;
        }
        if(isTouching(paddle.class) && getX() >= 509)
        {
            dX = -10;
            move();
            dX = -5;
        }
    }
    /**
     * used to set which side player one scores on
     */
    public void checkForScore1()
    {
        if (getX() >= 599 || getX() >= getWorld().getWidth()- 1)
        {
            setLocation(300, 200);
            time = 0;
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.score1();
        }

    }
    /**
     * used to set which side player one scores on
     */
    public void checkForScore2()
    {
        if (getX() <= 0 || getX() >= getWorld().getWidth()- 1)
        {
            setLocation(300, 200);
            time = 0; 
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.score2();
        }

    }
    

    
}

