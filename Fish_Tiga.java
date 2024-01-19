import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish_Tiga extends Fish
{
    
    public Fish_Tiga()
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
        Level_Dua.score.add(0);
        Level_Tiga.score.add(-2);
    }
}
