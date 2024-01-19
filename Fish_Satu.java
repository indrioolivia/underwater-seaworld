import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish_Satu extends Fish
{
    
    public Fish_Satu()
    {
        super(); // Call the constructor of the parent class
    }

    // Override the move method for custom behavior
    public void act()
    {
        super.move(); // Call the move method of the parent class
        // Additional behavior specific to Fish1
    }

    // Overload the checkEdge method for custom behavior
    protected void checkEdge()
    {
        super.checkEdge(); 
        Level_Satu.score.add(0);
        Level_Dua.score.add(-1);
        Level_Tiga.score.add(-2);
    }
}
