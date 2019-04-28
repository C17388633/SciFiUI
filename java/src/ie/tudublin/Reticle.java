package ie.tudublin;

import processing.core.PVector;

public class Reticle extends MechObject
{
    public Reticle(UI mech)
    {
        super(mech, 0, 0, 0, 0);
    }
    
    boolean fired = false;

    @Override
    public void update() {
    }

    @Override
    public void render() {
        mech.stroke(0,255,0);
        mech.ellipse(mech.mouseX, mech.mouseY, 20,20);
        mech.line(mech.mouseX - 20, mech.mouseY, mech.mouseX + 20, mech.mouseY);
        mech.line(mech.mouseX, mech.mouseY + 20, mech.mouseX, mech.mouseY - 20);
        mech.noStroke();
    }


    public void mouseClicked()
    {
        PVector mouse = new PVector(mech.mouseX,mech.mouseY);
        float dist1 = PVector.dist(mech.foe1.getPos(), mouse);
        if (dist1 < mech.foe1.diameter)
        {
            System.out.println("gone3");
            mech.mechObjects.remove(mech.foe1);
            mech.foe1.C.x = mech.foe1.pos.x;
            mech.foePresence1--;
        }
        float dist2 = PVector.dist(mech.foe2.getPos(), mouse);
        if (dist2 < mech.foe2.diameter)
        {
            System.out.println("gone3");
            mech.mechObjects.remove(mech.foe2);
            mech.foe2.C.x = mech.foe2.pos.x;
            mech.foePresence2--;
        }
        mech.stroke(255,0, 0);
        mech.line(mech.width, mech.height, mech.mouseX, mech.mouseY);
    }

}