package ie.tudublin;

import static processing.core.PConstants.LEFT;

public class StatusDisplay extends MechObject {
    public StatusDisplay(UI mech, float x) {
        super(mech, x, 0, 0, 0);
    }

    char[] statusWord ={'F','o','r',' ','S','t','a','t','u','s',' ','S','c','r','e','e','n'};  
    float spacing = ((mech.height / 2) - 20) / statusWord.length;

    // Mech health points
    int headHP = 100;
    int mainHP = 100;
    int arm1HP = 100;
    int arm2HP = 100;
    int leg1HP = 100;
    int leg2HP = 100;

    @Override
    public void update() {
        mech.fill(0);
        mech.stroke(200);
        mech.rect(0, mech.height / 2, 20, (mech.height / 2) - 20);
        mech.fill(255);
        mech.textAlign(LEFT);
        float downwards = (mech.height/2) + spacing;
        
        mech.text("[A]", 5, mech.height/2 + 10);
        for(int i = 0; i < statusWord.length; i++)
        {
            mech.text(statusWord[i], 5, downwards);
            downwards += spacing;
        }
        mech.fill(0);
    }

    @Override
    public void render()
    {
        mech.fill(0);
        mech.stroke(200);
        mech.rect(20, mech.height /2 , pos.x, (mech.height / 2) -20);
        mech.stroke(255);
        mech.noFill();

        // mech model
        // Head
        mech.line(pos.x/2, mech.height - (mech.height/4) - 90, (pos.x/2) - 10, mech.height - (mech.height/4) - 100);
        mech.line((pos.x/2) + 20, mech.height - (mech.height/4) - 90, (pos.x/2) + 30, mech.height - (mech.height/4) - 100);
        mech.line(pos.x/2, mech.height - (mech.height/4) - 90, (pos.x/2) + 20, mech.height - (mech.height/4) - 90);
        mech.line((pos.x/2) - 10, mech.height - (mech.height/4) - 100 , (pos.x/2) + 30, mech.height - (mech.height/4) - 100);
        mech.rect((pos.x/2) - 10, mech.height - (mech.height/4) - 120 , 40, 20, 5, 5, 0, 0);
        // Eyes
        mech.fill(0,255,0);
        mech.noStroke();
        mech.triangle((pos.x/2) + 10, mech.height - (mech.height/4) - 110, (pos.x/2) - 5, mech.height - (mech.height/4) - 105, (pos.x/2) - 5, mech.height - (mech.height/4) - 115);
        mech.fill(0,255,0);
        mech.triangle((pos.x/2) + 10, mech.height - (mech.height/4) - 110, (pos.x/2) + 25, mech.height - (mech.height/4) - 105, (pos.x/2) + 25, mech.height - (mech.height/4) - 115);
        mech.noFill();
        // Head health
        mech.stroke(100);
        mech.line((pos.x/2) + 10, mech.height - (mech.height/4) - 120, (pos.x/2) + 30, mech.height - (mech.height/4) - 140);
        mech.line((pos.x/2) + 30, mech.height - (mech.height/4) - 140, (pos.x/2) + 45, mech.height - (mech.height/4) - 140);
        mech.rect((pos.x/2) + 45, mech.height - (mech.height/4) - 155, 45, 30);
        mech.fill(255);
        mech.text("HeadHP", (pos.x/2) + 45, mech.height - (mech.height/4) - 143);
        mech.text(headHP + "%", (pos.x/2) + 45, mech.height - (mech.height/4) + - 128);
        mech.noFill();
        // Shoulders
        mech.stroke(255);
        mech.rect((pos.x/2) - 30, mech.height - (mech.height/4) - 70, 80, 30, 5, 5, 5, 5);
        mech.rect((pos.x/2) - 20, mech.height - (mech.height/4) - 60, 60, 10, 5, 5, 5, 5);
        // Arm 1
        mech.rect((pos.x/2) + 50, mech.height - (mech.height/4) - 60, 10, 10);
        mech.line((pos.x/2) + 60, mech.height - (mech.height/4) - 55, (pos.x/2) + 75, mech.height - (mech.height/4) - 40);
        mech.ellipse((pos.x/2) + 80, mech.height - (mech.height/4) - 10, 10, 10);
        mech.fill(0);
        mech.rect((pos.x/2) + 75, mech.height - (mech.height/4) - 40, 10, 30);
        mech.rect((pos.x/2) + 75, mech.height - (mech.height/4) - 5, 10, 10);
        mech.noFill();
        // Arm 1 health
        mech.stroke(100);
        mech.line((pos.x/2) + 80, mech.height - (mech.height/4) - 5, (pos.x/2) + 100, mech.height - (mech.height/4) - 5);
        mech.rect((pos.x/2) + 100, mech.height - (mech.height/4) - 20 , 45, 30);
        mech.fill(255);
        mech.text("Arm1HP", (pos.x/2) + 100, mech.height - (mech.height/4) - 8);
        mech.text(arm1HP + "%", (pos.x/2) + 100, mech.height - (mech.height/4) + 7);
        mech.noFill();
        // Arm 2
        mech.stroke(255);
        mech.rect((pos.x/2) - 40, mech.height - (mech.height/4) - 60, 10, 10);
        mech.line((pos.x/2) - 40, mech.height - (mech.height/4) - 55, (pos.x/2) - 55, mech.height - (mech.height/4) - 40);
        mech.ellipse((pos.x/2) - 60, mech.height - (mech.height/4) - 10, 10, 10);
        mech.fill(0);
        mech.rect((pos.x/2) - 65, mech.height - (mech.height/4) - 40, 10, 30);
        mech.rect((pos.x/2) - 65, mech.height - (mech.height/4) - 5, 10, 10);
        mech.noFill();
        // Arm 2 health
        mech.stroke(100);
        mech.line((pos.x/2) - 65, mech.height - (mech.height/4) - 5, (pos.x/2) - 80, mech.height - (mech.height/4) - 5);
        mech.rect((pos.x/2) - 125, mech.height - (mech.height/4) - 20 , 45, 30);
        mech.fill(255);
        mech.text("Arm2HP", (pos.x/2) - 125, mech.height - (mech.height/4) - 8);
        mech.text(arm2HP + "%", (pos.x/2) - 125, mech.height - (mech.height/4) + 7);
        mech.noFill();
        // Neck
        mech.stroke(255);
        mech.line((pos.x/2) + 10, mech.height - (mech.height/4) - 70, (pos.x/2) + 10, mech.height - (mech.height/4) - 90);
        // Torso health
        mech.stroke(100);
        mech.line((pos.x/2) + 20, mech.height - (mech.height/4) - 70, (pos.x/2) + 40, mech.height - (mech.height/4) - 90);
        mech.rect((pos.x/2) + 40, mech.height - (mech.height/4) - 105,  45, 30);
        mech.fill(255);
        mech.text("MainHP", (pos.x/2) + 40, mech.height - (mech.height/4) - 92);
        mech.text(mainHP + "%", (pos.x/2) + 40, mech.height - (mech.height/4) - 77);
        mech.noFill();
        // Hip
        mech.stroke(255);
        mech.fill(0);
        mech.rect((pos.x/2) - 10, mech.height - (mech.height/4) + 10, 40, + 10);
        mech.rect((pos.x/2) + 5, mech.height - (mech.height/4) - 10, 10, 30);
        mech.line((pos.x/2) - 15, mech.height - (mech.height/4) - 40 , (pos.x/2) + 5, mech.height - (mech.height/4) -10);
        mech.line((pos.x/2) + 35, mech.height - (mech.height/4) - 40 , (pos.x/2) + 15, mech.height - (mech.height/4) -10);
        // Leg 1
        mech.rect((pos.x/2) - 30, mech.height - (mech.height/4) + 10, 20, 40, 0, 0, 5, 5);
        mech.rect((pos.x/2) - 25, mech.height - (mech.height/4) + 50, 10, 3);
        mech.rect((pos.x/2) - 32, mech.height - (mech.height/4) + 53, 24, 20, 5, 5, 5, 5);
        mech.rect((pos.x/2) - 35, mech.height - (mech.height/4) + 113, 30, 10, 5, 5, 0, 0);
        mech.ellipse((pos.x/2) - 20, mech.height - (mech.height/4) + 113, 10, 10);
        mech.fill(0);
        mech.rect((pos.x/2) - 30, mech.height - (mech.height/4) + 73, 20, 40, 0, 0, 5, 5);
        mech.noFill();
        // Leg 1 health
        mech.stroke(100);
        mech.line((pos.x/2) - 30, mech.height - (mech.height/4) + 73, (pos.x/2) - 50, mech.height - (mech.height/4) + 73);
        mech.rect((pos.x/2) - 95, mech.height - (mech.height/4) + 58, 45, 30);
        mech.fill(255);
        mech.text("Leg1HP", (pos.x/2) - 95, mech.height - (mech.height/4) + 70);
        mech.text(leg1HP + "%", (pos.x/2) - 95, mech.height - (mech.height/4) + 85);
        mech.noFill();
        // Leg 2
        mech.stroke(255);
        mech.rect((pos.x/2) + 30, mech.height - (mech.height/4) + 10, 20, 40, 0, 0, 5, 5);
        mech.rect((pos.x/2) + 35, mech.height - (mech.height/4) + 50, 10, 3);
        mech.rect((pos.x/2) + 28, mech.height - (mech.height/4) + 53, 24, 20, 5, 5, 5, 5);
        mech.rect((pos.x/2) + 25, mech.height - (mech.height/4) + 113, 30, 10, 5, 5, 0, 0);
        mech.ellipse((pos.x/2) + 40, mech.height - (mech.height/4) + 113, 10, 10);
        mech.fill(0);
        mech.rect((pos.x/2) + 30, mech.height - (mech.height/4) + 73, 20, 40, 0, 0, 5, 5);
        mech.noFill();
        // Leg 2 health
        mech.stroke(100);
        mech.line((pos.x/2) + 50, mech.height - (mech.height/4) + 73, (pos.x/2) + 70, mech.height - (mech.height/4) + 73);
        mech.rect((pos.x/2) + 70, mech.height - (mech.height/4) + 58, 45, 30);
        mech.fill(255);
        mech.text("Leg2HP", (pos.x/2) + 70, mech.height - (mech.height/4) + 70);
        mech.text(leg2HP + "%", (pos.x/2) + 70, mech.height - (mech.height/4) + 85);
        mech.noFill();
    }

}