package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b1;
    Button b2;
    Button b3;
    Button scoreboard;
    //MovingCircle mc;
    Frame frame;
    Radar radar;
    Reticle reticle;
    StatusDisplay stats;
    Enemy foe1;
    Enemy foe2;
    float foePresence1 = 1;
    float foePresence2 = 1;
    int weaponChoice = 3;
    

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
        b1 = new Button(this, (width/2) - (width/5), height - (height/4), 100, 50, "Left Arm");
        b2 = new Button(this, (width/2) - 50, height - (height/4), 100, 50, "Head Laser");
        b3 = new Button(this, (width/2) + (width/5) - 100, height - (height/4), 100, 50, "Right Arm");
        scoreboard = new Button(this, width/2 - 100, height - (height/6), 200, 50, "Enemies Defeated: ");
        //mc = new MovingCircle(this, width / 2, height / 2, 50);

        frame = new Frame(this, width / 2, height / 2);
        mechObjects.add(frame);
        radar = new Radar(this, frame.xAlign/2f, frame.yAlign);
        mechObjects.add(radar);
        reticle = new Reticle(this);
        mechObjects.add(reticle);
        stats = new StatusDisplay(this, (width / 4));
        mechObjects.add(stats);
        foe1 = new Enemy(this, width/2, height/2);
        mechObjects.add(foe1);
        foe2 = new Enemy(this, width/2, height/2);
        mechObjects.add(foe2);
    }

    public void draw()
    {
        background(0);
        //mc.update();
        //mc.render();
        
        if(foePresence1 > 0 && foePresence1 < 3 )
        {
            foe1.render();  
            foe1.update();
        }
        if(foePresence1 <= 0)
        {
            foe1 = new Enemy(this, width/2, height/2);
            foePresence1++;
        }
        if(foePresence2 > 0 && foePresence2 < 3 )
        {
            foe2.render();  
            foe2.update();
        }
        if(foePresence2 <= 0)
        {
            foe2 = new Enemy(this, width/2, height/2);
            foePresence2++;
        }

        foe1.checkCollisions();
        foe2.checkCollisions();

        if(weaponChoice == 1)
        {
            b1.active();
            b2.nonActive();
            b3.nonActive();
        }
        else if(weaponChoice == 2)
        {
            b1.nonActive();
            b2.active();
            b3.nonActive();
        }
        else
        {
            b1.nonActive();
            b2.nonActive();
            b3.active();
        }
        scoreboard.show();
        

        if(mousePressed)
        {
            reticle.mouseClicked();
        }

        frame.render();

        radar.update();
        radar.render();

        reticle.render();

        if (keyPressed) {
            if (key == 'A' || key == 'a') 
            {
                System.out.println("A key pressed");
                stats.render();
            }
        }
        stats.update();
        
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

