package ie.tudublin;

public class Frame extends MechObject
{
    public float xAlign = mech.width/5;
    public float yAlign = mech.height/7; //75

    public Frame(UI mech, float x, float y)
    {
        super(mech, x, y, 0, 0);
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        mech.stroke(100);

        // Horizontal center frame
        mech.line(pos.x - xAlign, pos.y - yAlign, pos.x - xAlign, pos.y + yAlign);
        mech.line(pos.x + xAlign, pos.y - yAlign, pos.x + xAlign, pos.y + yAlign);

        // Vertical center frame
        mech.line(pos.x - xAlign, pos.y - yAlign, pos.x + xAlign, pos.y - yAlign);
        mech.line(pos.x - xAlign, pos.y + yAlign, pos.x + xAlign, pos.y + yAlign);

        // Top two frame
        mech.line(pos.x - xAlign, pos.y - yAlign, xAlign, yAlign*2);
        mech.line(pos.x + xAlign, pos.y - yAlign, pos.x + xAlign*2, pos.y - xAlign*2);

        // Bottom two frame
        mech.line(pos.x - xAlign, pos.y + yAlign, pos.x - xAlign*2, pos.y + xAlign*2);
        mech.line(pos.x + xAlign, pos.y + yAlign, pos.x + xAlign*2, pos.y + xAlign*2);

        // Radar square
        mech.line(xAlign, 0, xAlign, yAlign*2);
        mech.line(0, yAlign*2, xAlign, yAlign*2);
    }

}