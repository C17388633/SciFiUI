package ie.tudublin;

import processing.core.PVector;

public class Reticle extends MechObject
{
    public Reticle(UI mech)
    {
        super(mech, 0, 0, 0, 0);
    }
    
    // Counter for the amount of Enemies defeated
    int defeated =  0;

    @Override
    public void update() {
    }

    @Override
    public void render() {
        mech.stroke(0,255,0);
        mech.noFill();
        mech.ellipse(mech.mouseX, mech.mouseY, 20,20);
        mech.line(mech.mouseX - 20, mech.mouseY, mech.mouseX + 20, mech.mouseY);
        mech.line(mech.mouseX, mech.mouseY + 20, mech.mouseX, mech.mouseY - 20);
        mech.noStroke();
    }


    public void mouseClicked()
    {
        // Checking the distance between the mouse and enemy.
        PVector mouse = new PVector(mech.mouseX,mech.mouseY);
        float dist1 = PVector.dist(mech.foe1.getPos(), mouse);
        if (dist1 < mech.foe1.diameter/2)
        {
            System.out.println("gone3");
            mech.mechObjects.remove(mech.foe1);
            mech.foe1.C.x = mech.foe1.pos.x;
            mech.foePresence1--;
            defeated++;
        }
        float dist2 = PVector.dist(mech.foe2.getPos(), mouse);
        if (dist2 < mech.foe2.diameter/2)
        {
            System.out.println("gone3");
            mech.mechObjects.remove(mech.foe2);
            mech.foe2.C.x = mech.foe2.pos.x;
            mech.foePresence2--;
            defeated++;
        }

        // Decides where the laser is pointing from.
        if(mech.weaponChoice == 1)
        {
            mech.stroke(255,0, 0);
            mech.line(0, mech.height, mech.mouseX, mech.mouseY);
        }
        else if(mech.weaponChoice == 2)
        {
            mech.stroke(255,0, 0);
            mech.line(mech.width/4, 0, mech.mouseX, mech.mouseY);
            mech.line((mech.width/4) * 3, 0, mech.mouseX, mech.mouseY);
        }
        else
        {
            mech.stroke(255,0, 0);
            mech.line(mech.width, mech.height, mech.mouseX, mech.mouseY);
        }
        
    }

}