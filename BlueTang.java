import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BlueTang extends Fish
{
    
    public BlueTang()
    {
        super();
    }
    
    public void act()
    {
        super.move();
    }
    
    protected void checkEdge()
    {
        super.checkEdge(); 
        Easy.score.add(0);
        Medium.score.add(-2);
        Hard.score.add(-3);
    }
    
}
