import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddle extends Actor
{   
    private String upButton;
    private String downButton;
    public paddle(String up, String down)
    {
        upButton = up;
        downButton = down;
    }
    /**
     * Act - do whatever the paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        paddleMoves();
        setRotation(90);
    }

    public void paddleMoves()
    /**
     * sets what direction my paddles move and what button to press
     */
    {
        if(Greenfoot.isKeyDown(upButton))
        {
             setLocation(getX(), getY() - 6);
        }
        if(Greenfoot.isKeyDown(downButton))
        {
             setLocation(getX(), getY() + 6); 
        }
    }
    

}
    
    

