package ie.tudublin;

public class Frame extends MechObject
{
    private float xAlign = mech.width/5;
    private float yAlign =75;

    public Frame(UI mech, float x, float y)
    {
        super(mech, x, y, 0, 0);
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        mech.stroke(211);
        mech.line(pos.x - xAlign, pos.y -yAlign, pos.x - xAlign, pos.y + yAlign);
        mech.line(pos.x + xAlign, pos.y -yAlign, pos.x + xAlign, pos.y + yAlign);
        //mech.line(pos.x - xAlign, pos.y -yAlign, pos.x - xAlign*2, pos.y - yAlign*2);
    }

}