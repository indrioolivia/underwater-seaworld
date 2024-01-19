import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hard extends Level
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    
    public Hard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(160) < 3)
        {
            addObject(new Clownfish(), 948, Greenfoot.getRandomNumber(240));
        }
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            addObject(new BlueTang(), 948, Greenfoot.getRandomNumber(3600));
        }
        if(Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Pompano(), 948, Greenfoot.getRandomNumber(400));
        }
        if(Greenfoot.getRandomNumber(500) < 1)
        {
            addObject(new Fugu(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(450) < 2)
        {
            addObject(new Piranha(), 948, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(600) < 3)
        {
            addObject(new Shark(), 948, Greenfoot.getRandomNumber(140));
        }
        if(Hard.score.getValue()>=600)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new WinPage());
        }
    }
    
    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,37,303);
        Pompano fish3 = new Pompano();
        addObject(fish3,440,451);
        Pompano fish32 = new Pompano();
        addObject(fish32,167,27);
        Clownfish fish1 = new Clownfish();
        addObject(fish1,660,488);
        Fugu predator1 = new Fugu();
        addObject(predator1,761,489);
        BlueTang fish2 = new BlueTang();
        addObject(fish2,881,432);
        BlueTang fish22 = new BlueTang();
        addObject(fish22,557,163);
        Piranha predator2 = new Piranha();
        addObject(predator2,525,27);
        Shark predator3 = new Shark();
        addObject(predator3,880,204);
        Clownfish fish12 = new Clownfish();
        addObject(fish12,799,100);
        Pompano fish33 = new Pompano();
        addObject(fish33,880,27);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(score, 870, 45);
        hp.setValue(0);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
