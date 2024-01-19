import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Easy extends Level
{
    public Easy()
    {
        super();
    }

    protected void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,60,169);
        Clownfish fish1 = new Clownfish();
        addObject(fish1,768,480);
        Clownfish fish12 = new Clownfish();
        addObject(fish12,684,27);
        Clownfish fish13 = new Clownfish();
        addObject(fish13,488,419);
        Clownfish fish14 = new Clownfish();
        addObject(fish14,841,220);
        Clownfish fish15 = new Clownfish();
        addObject(fish15,492,176);
        BlueTang fish2 = new BlueTang();
        addObject(fish2,775,137);
        BlueTang fish22 = new BlueTang();
        addObject(fish22,668,415);
        BlueTang fish23 = new BlueTang();
        addObject(fish23,563,284);
        Fugu predator1 = new Fugu();
        addObject(predator1,491,34);
        Fugu predator12 = new Fugu();
        addObject(predator12,571,489);

        addObject(score,80,45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }

    protected World nextLevel()
    {
        return new Medium(); // Assuming Level2 is the next level
    }
}
