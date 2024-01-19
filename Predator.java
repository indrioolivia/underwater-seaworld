import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Predator extends Actor
{
    protected void moveLeft(int speed)
    {
        setLocation(getX() - speed, getY());
        checkCollision();
        checkEdge();
    }

    protected void checkCollision()
    {
        if (isTouching(MainFish.class))
        {
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
    }

    protected void checkEdge()
    {
        if (getX() < 5)
        {
            getWorld().removeObject(this);
        }
    }
}
