package ie.tudublin;

public class Radar extends MechObject
{
    
    public Radar(UI mech, float x, float y) 
    {
        super(mech, x, y, 0, 0);
    }

    float frequency = 1;
    float diameter1 = pos.y*1.5f;
    float diameter2 = pos.y*1.5f;
    float theta = 0;

    public void render()
    {
        mech.stroke(200);

        /*
        ui.noFill();
        ui.stroke(0,200, 0);
        ui.translation(pos.x, pos.y);
        ui.rotate(theta);
        ui.ellipse(0, 0, diameter1, diameter1);
        line(0, 0,0,-radius);
        */

        float radius1 = diameter1 /2;
        float radius2 = diameter2 /2;
        
        mech.noFill();
        mech.stroke(0,200, 0);
        mech.ellipse(pos.x, pos.y, diameter1, diameter2);
        float x2 = pos.x + (float) Math.sin(theta) * radius1;
        float y2 = pos.y - (float) Math.cos(theta) * radius2;
        mech.line(pos.x, pos.y, x2, y2);

        mech.stroke(255,140,0);
        mech.strokeWeight(3);
        float mapX1 = mech.map( mech.foe1.pos.x, 0, mech.width, pos.x - diameter1, pos.x + diameter1);
        float mapY1 = mech.map( mech.foe1.pos.y, 0, mech.height, pos.y - diameter2, pos.y + diameter2);
        mech.line(mapX1, mapY1, mapX1, mapY1);
        float mapX2 = mech.map( mech.foe2.pos.x, 0, mech.width, pos.x - diameter1, pos.x + diameter1);
        float mapY2 = mech.map( mech.foe2.pos.y, 0, mech.height, pos.y - diameter2, pos.y + diameter2);
        mech.line(mapX2, mapY2, mapX2, mapY2);
        mech.strokeWeight(1);
    }

    float timeDelta = 1.0f/60.0f;
    double TWO_PI = 6.2831855;

    public void update()
    {
        theta += TWO_PI * timeDelta * frequency;
    }
}