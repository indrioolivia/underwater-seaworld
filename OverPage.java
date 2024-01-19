import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    
    public OverPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1);
        prepare();
    }
    
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,334,382);
        Replay replay = new Replay();
        addObject(replay,582,377);
        showText("The Predator ate you, YOU LOSE!!", 475, 280);
        showText("YOUR SCORE : " +Level_Satu.score.getValue()+ " points", 475, 305);
        Greenfoot.playSound("gameOver.wav");
    }
}
