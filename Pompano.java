import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pompano extends Fish
{
    
    public Pompano()
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
        Medium.score.add(0);
        Hard.score.add(-2);
    }
}
