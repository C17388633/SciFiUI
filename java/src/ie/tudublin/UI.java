package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
	//Button b;
    //MovingCircle mc;
    Frame frame;
    Radar radar;
    Reticle reticle;

    boolean[] keys = new boolean[1024];

    public ArrayList<MechObject> mechObjects = new ArrayList<MechObject>();

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(800, 600);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        //b = new Button(this, 50, 50, 100, 50, "I am a button");
        //mc = new MovingCircle(this, width / 2, height / 2, 50);


        frame = new Frame(this, width / 2, height / 2);
        mechObjects.add(frame);
        radar = new Radar(this, width/6, height/6);
        mechObjects.add(radar);
        reticle = new Reticle(this);
        mechObjects.add(reticle);
    }

    public void draw()
    {
        background(255);
        //b.render();

        //mc.update();
        //mc.render();

        frame.render();
        //radar.update();
        //radar.render();

        //reticle.render();

        if (checkKey('A'))
        {
            reticle.render();
            System.out.println("A key pressed");
        }
        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

