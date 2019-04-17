package ie.tudublin;

public class StatusDisplay extends MechObject
{
    public StatusDisplay(UI mech, float x)
    {
        super(mech, x, 0, 0, 0);
    }

    boolean slideDone = false;

    public void slideUP()
    {
        float i = 0;
        for(i = - pos.x ; i <= 20 ; i++)
        {
            update();
            mech.stroke(200);
            //mech.rect(20, mech.height /2 , pos.x, (mech.height / 2) -20);
            mech.rect(i, mech.height/2, pos.x, (mech.height / 2) -20);
        }
        if(i == 20)
        {
            slideDone = true;
        }
        if(slideDone == true)
        {
            render();
        }
        
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
        //mech.line((pos.x/2) + 10, mech.height - (mech.height/4) -10,(pos.x/2) + 10, mech.height - (mech.height/4)  + 10);
       
    }

}