import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Predator_Tiga extends Predator
{
    public void act()
    {
        setLocation(getX()-4, getY());
        if(isTouching(MainFish.class))
        {
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX() < 3)
        getWorld().removeObject(this);
        
    }
}
