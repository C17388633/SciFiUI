package ie.tudublin;

import processing.core.PVector;

public class Enemy extends MechObject
{
    public Enemy(UI mech, float x, float y)
    {
        super(mech, x, y, 0, 0);
    }

    float theta = mech.random(0,360);
    float diameter = 50;
    PVector C = pos;

    @Override
    public void update() {
        C.x = C.x + (float) Math.sin(theta);
       
        C.y = C.y - (float) Math.cos(theta);
        checkCollisions();
    }

    @Override
    public void render() {
        
        mech.stroke(150,0,150);
        mech.ellipse(C.x, C.y, diameter, diameter);
        float x2 = C.x + (float) Math.sin(theta) * diameter;
        float y2 = C.y - (float) Math.cos(theta) * diameter;
        mech.line(C.x, C.y, x2, y2);
    }

    public void checkCollisions()
    {
        if (C.x <= 0 || C.x >= mech.width)
        {
            mech.mechObjects.remove(this);
            mech.foePresence1--;
            System.out.println("gone1");
            C.x = mech.width/2;
        }
        else if(C.y <= 0 || C.y >= mech.height)
        {
            mech.mechObjects.remove(this);
            mech.foePresence2--;
            System.out.println("gone2");
            C.x = mech.height/2;
        }
    }

}