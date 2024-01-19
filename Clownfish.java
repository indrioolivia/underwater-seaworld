import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Clownfish extends Fish
{
    
    public Clownfish()
    {
        super(); 
    }

    public void act()
    {
        super.act(); 
    }

    protected void checkEdge()
    {
        super.checkEdge(); 
        Easy.score.add(0);
        Medium.score.add(-1);
        Hard.score.add(-2);
    }
}
