import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Page extends World
{

    /**
     * Constructor for objects of class Page.
     * 
     */
    public Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
    }

    public abstract void prepare();
}
