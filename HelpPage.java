import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HelpPage extends World
{
    public HelpPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }

    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,79,480);
    }
}
