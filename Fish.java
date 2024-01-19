import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{
    protected int speed;
    
    public Fish()
    {
        speed = Greenfoot.getRandomNumber(4) + 1;
    }
    
    public void act()
    {
        setLocation(getX() - speed, getY());
        if (getX() == 0)
        {
            checkEdge();
        }
    }
    
    protected void checkEdge()
    {
        getWorld().removeObject(this);
    }
}
