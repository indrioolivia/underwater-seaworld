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
        move();
    }

    protected void move()
    {
        setLocation(getX() - speed, getY());
        checkEdge();
    }

    protected void checkEdge()
    {
        if (getX() == 0)
        {
            // Default behavior when reaching the edge
            getWorld().removeObject(this);
        }
    }
}
