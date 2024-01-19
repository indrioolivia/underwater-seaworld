import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Predator_Dua extends Predator
{
    public void act()
    {
        setLocation(getX()-3, getY());
        if(isTouching(MainFish.class))
        {
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}
