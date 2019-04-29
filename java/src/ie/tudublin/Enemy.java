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
        checkOutOfBounds();
    }

    @Override
    public void render() {
        
        mech.stroke(150,0,150);
        mech.strokeWeight(3);
        mech.ellipse(C.x, C.y, diameter, diameter);
        float x2 = C.x + (float) Math.sin(theta) * diameter;
        float y2 = C.y - (float) Math.cos(theta) * diameter;
        mech.line(C.x, C.y, x2, y2);
        mech.strokeWeight(1);
    }

    public void checkOutOfBounds()
    {
        // if hits the left or the right side of the screen go back to the middle.
        if (C.x <= 0 || C.x >= mech.width)
        {
            mech.mechObjects.remove(this);
            if(this == mech.foe1)
            {
                mech.foePresence1--;
            }
            else
            {
                mech.foePresence2--;
            }
            System.out.println("gone1");
            C.x = pos.x;
        }
        // if hits the top or the bottom of the screen go back to the middle.
        else if(C.y <= 0 || C.y >= mech.height)
        {
            mech.mechObjects.remove(this);
            if(this == mech.foe1)
            {
                mech.foePresence1--;
            }
            else
            {
                mech.foePresence2--;
            }
            System.out.println("gone2");
            C.x = pos.y;
        }
    }

    // Function for mech to lose HP if hit at certain places.
    public void checkCollisions()
    {
        // head
        if((C.y <= 0 && C.x >= mech.width/4) || (C.y <= 0 && C.x <= mech.width*(3/4)))
        {
            mech.stats.headHP -= 10;
            mech.fill(255);
            //mech.text("Warning Head Unit has received Damage",0, mech.height/2);
            System.out.println(" Head Hit");
            mech.noFill();
        }
        // Right Arm
        if((C.y < mech.height/2 && C.x >= mech.width) || (C.y <=0 && C.x >= mech.width*(3/4)))
        {
            mech.stats.arm2HP -= 10;
            System.out.println(" Right Arm Hit");
        }
        // Left Arm
        if((C.y < mech.height/2 && C.x <= 0) || (C.y <=0 && C.x >= mech.width/4))
        {
            mech.stats.arm1HP -= 10;
            System.out.println(" Left Arm Hit");
        }
        // Torso
        if((C.y >= mech.height && C.x >= mech.width/4) || (C.y >= mech.height && C.x <= mech.width*(3/4)))
        {
            mech.stats.mainHP -= 10;
            System.out.println(" Main Body Hit");
        }
        // Right Leg
        if((C.y >= mech.height/2 && C.x >= mech.width) || (C.y >= mech.height && C.x >= mech.width*(3/4)))
        {
            mech.stats.leg1HP -= 10;
            System.out.println(" Right Leg Hit");
        }
        // Left Leg
        if((C.y >= mech.height/2 && C.x <= 0) || (C.y >= mech.height && C.x <= mech.width/4))
        {
            mech.stats.leg2HP -= 10;
            System.out.println(" Left Leg Hit");
        }
    }

}