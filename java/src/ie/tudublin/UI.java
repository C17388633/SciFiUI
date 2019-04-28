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
    StatusDisplay stats;
    Enemy foe;
    float foePresence = 1;

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
        radar = new Radar(this, frame.xAlign/2f, frame.yAlign);
        mechObjects.add(radar);
        reticle = new Reticle(this);
        mechObjects.add(reticle);
        stats = new StatusDisplay(this, (width / 4));
        mechObjects.add(stats);
        foe = new Enemy(this, width/2, height/2);
        mechObjects.add(foe);

    }

    public void draw()
    {
        background(0);
        //b.render();

        //mc.update();
        //mc.render();
        foe.render();  
        foe.update();

        if(mousePressed)
        {
            reticle.mouseClicked();
        }

        frame.render();

        radar.update();
        radar.render();

        if (keyPressed) {
            if (key == 'A' || key == 'a') 
            {
                System.out.println("A key pressed");
                stats.render();
            }
        }
        stats.update();
        
        
        reticle.render();
    
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

