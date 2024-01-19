import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Clownfish extends Fish
{
    
    public Clownfish()
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
        Easy.score.add(0);
        Medium.score.add(-1);
        Hard.score.add(-2);
    }
}
