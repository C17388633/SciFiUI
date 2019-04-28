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

    public void render()
    {
        mech.noFill();
        mech.stroke(255);
        mech.rect(x, y, width, height);
        mech.textAlign(PApplet.CENTER, PApplet.CENTER);
        mech.fill(255);
        mech.text(text, x + width * 0.5f, y + height * 0.5f);
        mech.noFill();
    }

    public void update()
    {

    }
}