import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HelpPage extends Page
{
    public HelpPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
    }

    public void prepare()
    {
        Back backButton = new Back();
        addObject(backButton,79,480);
    }
}
