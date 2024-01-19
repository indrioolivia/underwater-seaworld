import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level_Tiga extends Level
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    
    public Level_Tiga()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(160) < 3)
        {
            addObject(new Fish_Satu(), 948, Greenfoot.getRandomNumber(240));
        }
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            addObject(new Fish_Dua(), 948, Greenfoot.getRandomNumber(3600));
        }
        if(Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Fish_Tiga(), 948, Greenfoot.getRandomNumber(400));
        }
        if(Greenfoot.getRandomNumber(500) < 1)
        {
            addObject(new Predator_Satu(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(450) < 2)
        {
            addObject(new Predator_Dua(), 948, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(600) < 3)
        {
            addObject(new Predator_Tiga(), 948, Greenfoot.getRandomNumber(140));
        }
        if(Level_Tiga.score.getValue()>=600)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new WinPage());
        }
    }
    
    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,37,303);
        Fish_Tiga fish3 = new Fish_Tiga();
        addObject(fish3,440,451);
        Fish_Tiga fish32 = new Fish_Tiga();
        addObject(fish32,167,27);
        Fish_Satu fish1 = new Fish_Satu();
        addObject(fish1,660,488);
        Predator_Satu predator1 = new Predator_Satu();
        addObject(predator1,761,489);
        Fish_Dua fish2 = new Fish_Dua();
        addObject(fish2,881,432);
        Fish_Dua fish22 = new Fish_Dua();
        addObject(fish22,557,163);
        Predator_Dua predator2 = new Predator_Dua();
        addObject(predator2,525,27);
        Predator_Tiga predator3 = new Predator_Tiga();
        addObject(predator3,880,204);
        Fish_Satu fish12 = new Fish_Satu();
        addObject(fish12,799,100);
        Fish_Tiga fish33 = new Fish_Tiga();
        addObject(fish33,880,27);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(score, 870, 45);
        hp.setValue(0);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
