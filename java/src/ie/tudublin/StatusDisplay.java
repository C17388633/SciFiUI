package ie.tudublin;

public class StatusDisplay extends MechObject
{
    public StatusDisplay(UI mech, float x)
    {
        super(mech, x, 0, 0, 0);
    }


    @Override
    public void update() {

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
        // Shoulders
        mech.line((pos.x/2) - 30, mech.height - (mech.height/4) - 70, (pos.x/2) + 50, mech.height - (mech.height/4) - 70);
        // Backbone
        mech.line((pos.x/2) + 10, mech.height - (mech.height/4) - 90, (pos.x/2) + 10, mech.height - (mech.height/4) + 20);
        // Hip
        mech.line((pos.x/2) - 10, mech.height - (mech.height/4) + 20, (pos.x/2) + 30, mech.height - (mech.height/4) + 20);
   
    }

}