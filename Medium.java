import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Medium extends Level
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    
    public Medium()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
       
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(169) < 3)
        {
            addObject(new Clownfish(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new BlueTang(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(120) < 3)
        {
            addObject(new Pompano(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            addObject(new Fugu(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(250) < 3)
        {
            addObject(new Piranha(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Medium.score.getValue()>=150)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Hard());
        }
    }
    
    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,34,276);
        Clownfish fish1 = new Clownfish();
        addObject(fish1,806,509);
        Clownfish fish12 = new Clownfish();
        addObject(fish12,534,416);
        Clownfish fish13 = new Clownfish();
        addObject(fish13,517,163);
        Clownfish fish14 = new Clownfish();
        addObject(fish14,763,107);
        BlueTang fish2 = new BlueTang();
        addObject(fish2,688,484);
        BlueTang fish22 = new BlueTang();
        addObject(fish22,778,274);
        Pompano fish3 = new Pompano();
        addObject(fish3,416,490);
        Pompano fish32 = new Pompano();
        addObject(fish32,417,69);
        Fugu predator1 = new Fugu();
        addObject(predator1,933,423);
        Fugu predator12 = new Fugu();
        addObject(predator12,627,228);
        Piranha predator2 = new Piranha();
        addObject(predator2,735,384);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(score, 870, 45);
        hp.setValue(0);
        Greenfoot.playSound("waterAmb1.wav");
    }
    
    protected World nextLevel()
    {
        return new Hard(); // Assuming Level2 is the next level
    }
}
