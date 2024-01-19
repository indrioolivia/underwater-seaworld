import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainFish extends Fish
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
        if(isTouching(Clownfish.class))
        {
            removeTouching(Clownfish.class);
            Easy.score.add(2);
            Medium.score.add(3);
            Hard.score.add(4);
            Greenfoot.playSound("bite1.wav");
        }
        if(isTouching(BlueTang.class))
        {
            removeTouching(BlueTang.class);
            Easy.score.add(2);
            Medium.score.add(5);
            Hard.score.add(6);
            Greenfoot.playSound("bite2.wav");
        }
        if(isTouching(Pompano.class))
        {
            removeTouching(Pompano.class);
            Medium.score.add(6);
            Hard.score.add(7);
            Greenfoot.playSound("bite3.wav");
        }
    }
}
