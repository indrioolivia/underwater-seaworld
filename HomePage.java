import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomePage extends Page
{
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        prepare();
    }
    
    public void prepare()
    {
        Play play = new Play();
        addObject(play,509,427);
        Help help = new Help();
        addObject(help,62,502);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
