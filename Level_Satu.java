import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level_Satu extends Level
{
    public Level_Satu()
    {
        super();
    }
    

    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,60,169);
        Fish_Satu fish1 = new Fish_Satu();
        addObject(fish1,768,480);
        Fish_Satu fish12 = new Fish_Satu();
        addObject(fish12,684,27);
        Fish_Satu fish13 = new Fish_Satu();
        addObject(fish13,488,419);
        Fish_Satu fish14 = new Fish_Satu();
        addObject(fish14,841,220);
        Fish_Satu fish15 = new Fish_Satu();
        addObject(fish15,492,176);
        Fish_Dua fish2 = new Fish_Dua();
        addObject(fish2,775,137);
        Fish_Dua fish22 = new Fish_Dua();
        addObject(fish22,668,415);
        Fish_Dua fish23 = new Fish_Dua();
        addObject(fish23,563,284);
        Predator_Satu predator1 = new Predator_Satu();
        addObject(predator1,491,34);
        Predator_Satu predator12 = new Predator_Satu();
        addObject(predator12,571,489);

        addObject(score,80,45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }

    protected World nextLevel()
    {
        return new Level_Dua(); // Assuming Level2 is the next level
    }
}
