import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainFish extends Actor
{
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left")){
                setLocation(getX() -4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
                setLocation(getX() +4, getY());
        }
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -6);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() +6);
        }
    }
    
    private void checkCollision()
    {
        if(isTouching(Fish_Satu.class))
        {
            removeTouching(Fish_Satu.class);
            Level_Satu.score.add(2);
            Level_Dua.score.add(3);
            Level_Tiga.score.add(4);
            Greenfoot.playSound("bite1.wav");
        }
        if(isTouching(Fish_Dua.class))
        {
            removeTouching(Fish_Dua.class);
            Level_Satu.score.add(2);
            Level_Dua.score.add(5);
            Level_Tiga.score.add(6);
            Greenfoot.playSound("bite2.wav");
        }
        if(isTouching(Fish_Tiga.class))
        {
            removeTouching(Fish_Tiga.class);
            Level_Dua.score.add(6);
            Level_Tiga.score.add(7);
            Greenfoot.playSound("bite3.wav");
        }
    }
}
