import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish_Dua extends Fish
{
    
    public Fish_Dua()
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
        Level_Satu.score.add(0);
        Level_Dua.score.add(-2);
        Level_Tiga.score.add(-3);
    }
    
}
