import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level_Dua extends Level
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    
    public Level_Dua()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
       
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(169) < 3)
        {
            addObject(new Fish_Satu(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new Fish_Dua(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(120) < 3)
        {
            addObject(new Fish_Tiga(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            addObject(new Predator_Satu(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(250) < 3)
        {
            addObject(new Predator_Dua(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Level_Dua.score.getValue()>=150)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Level_Tiga());
        }
    }
    
    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,34,276);
        Fish_Satu fish1 = new Fish_Satu();
        addObject(fish1,806,509);
        Fish_Satu fish12 = new Fish_Satu();
        addObject(fish12,534,416);
        Fish_Satu fish13 = new Fish_Satu();
        addObject(fish13,517,163);
        Fish_Satu fish14 = new Fish_Satu();
        addObject(fish14,763,107);
        Fish_Dua fish2 = new Fish_Dua();
        addObject(fish2,688,484);
        Fish_Dua fish22 = new Fish_Dua();
        addObject(fish22,778,274);
        Fish_Tiga fish3 = new Fish_Tiga();
        addObject(fish3,416,490);
        Fish_Tiga fish32 = new Fish_Tiga();
        addObject(fish32,417,69);
        Predator_Satu predator1 = new Predator_Satu();
        addObject(predator1,933,423);
        Predator_Satu predator12 = new Predator_Satu();
        addObject(predator12,627,228);
        Predator_Dua predator2 = new Predator_Dua();
        addObject(predator2,735,384);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(score, 870, 45);
        hp.setValue(0);
        Greenfoot.playSound("waterAmb1.wav");
    }
    
    protected World nextLevel()
    {
        return new Level_Tiga(); // Assuming Level2 is the next level
    }
}
