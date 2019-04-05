package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Frame frame;

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


        /*ship = new Ship(this, width / 2, height / 2, 5, 50);
        gameObjects.add(ship);
        aiShip = new AIShip(this, 100, 100, 5, 50);
        gameObjects.add(aiShip);
        */

        frame = new Frame(this, width / 2, height / 2);
        mechObjects.add(frame);
    }

    public void draw()
    {
        background(0);
        //b.render();

        //mc.update();
        //mc.render();

        frame.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

