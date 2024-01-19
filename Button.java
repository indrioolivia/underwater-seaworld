import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private Class<? extends World> worldClass; // Tipe data kelas dunia yang dituju

    public Button(Class<? extends World> worldClass)
    {
        this.worldClass = worldClass;
    }

    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            try {
                World world = worldClass.newInstance();
                Greenfoot.setWorld(world);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
