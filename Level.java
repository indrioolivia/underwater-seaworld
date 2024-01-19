import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Level extends World
{
    abstract void prepare();
    
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");

    public Level()
    {
        super(950, 550, 1);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new Clownfish(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            addObject(new BlueTang(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 3)
        {
            addObject(new Fugu(), 948, Greenfoot.getRandomNumber(360));
        }
        checkScore();
    }

    protected void checkScore()
    {
        if(Level.score.getValue() >= 50)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(nextLevel());
        }
    }

    protected World nextLevel()
    {
        return null;
    }
}
