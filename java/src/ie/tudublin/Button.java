package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI mech;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Button(UI mech, float x, float y, float width, float height, String text)
    {
        this.mech = mech;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    // When this weapons is not being used.
    public void nonActive()
    {
        mech.noFill();
        mech.stroke(255);
        mech.rect(x, y, width, height);
        mech.textAlign(PApplet.CENTER, PApplet.CENTER);
        mech.fill(255);
        mech.text(text, x + width * 0.5f, y + height * 0.5f);
        mech.noFill();
        if(mech.mousePressed)
        {
            mouseReleased();
        }
    }

    // When this weapons is being used.
    public void active()
    {
        mech.fill(255);
        mech.stroke(255);
        mech.rect(x, y, width, height);
        mech.textAlign(PApplet.CENTER, PApplet.CENTER);
        mech.fill(0);
        mech.text(text, x + width * 0.5f, y + height * 0.5f);
        mech.noFill();
        if(mech.mousePressed)
        {
            mouseReleased();
        }
    }

    public void mouseReleased()
    {
        float dist = mech.dist(x + (width/2), y + (height/2), mech.mouseX, mech.mouseY);
        if(dist <= height /2)
        {
            if(this != mech.b1 && this != mech.b2)
            {
                mech.weaponChoice = 3;
            }
            else if(this != mech.b1 && this != mech.b3)
            {
                mech.weaponChoice = 2;
            }
            else
            {
                mech.weaponChoice = 1;
            }
        }
    }

    // Method for the Score Display
    public void show()
    {
        mech.noFill();
        mech.stroke(255);
        mech.rect(x, y, width, height);
        mech.textAlign(PApplet.CENTER, PApplet.CENTER);
        mech.fill(255);
        mech.text(text + mech.reticle.defeated, x + width * 0.5f, y + height * 0.5f);
        mech.noFill();
    } 
}