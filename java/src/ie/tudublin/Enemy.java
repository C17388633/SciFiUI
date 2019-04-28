package ie.tudublin;


public class Enemy extends MechObject
{
    public Enemy(UI mech, float x, float y)
    {
        super(mech, x, y, 0, 0);
    }

    float theta = mech.random(0,360);
    float diameter = 50;

    @Override
    public void update() {
        pos.x = pos.x + (float) Math.sin(theta);
       
        pos.y = pos.y - (float) Math.cos(theta);
        checkCollisions();
    }

    @Override
    public void render() {
        
        mech.stroke(150,0,150);
        mech.ellipse(pos.x, pos.y, diameter, diameter);
        float x2 = pos.x + (float) Math.sin(theta) * diameter;
        float y2 = pos.y - (float) Math.cos(theta) * diameter;
        mech.line(pos.x, pos.y, x2, y2);
    }

    public void checkCollisions()
    {
        if (pos.x <= 0 || pos.x >= mech.width)
        {
            mech.mechObjects.remove(this);
            mech.foePresence--;
            System.out.println("gone1");
        }
        else if(pos.y <= 0 || pos.y >= mech.height)
        {
            mech.mechObjects.remove(this);
            mech.foePresence--;
            System.out.println("gone2");
        }
    }

}