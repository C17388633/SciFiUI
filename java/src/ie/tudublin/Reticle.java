package ie.tudublin;

public class Reticle extends MechObject
{
    public Reticle(UI mech)
    {
        super(mech, 0, 0, 0, 0);
    }

    @Override
    public void update() {
    }

    @Override
    public void render() {
        mech.stroke(0);
        mech.ellipse(mech.mouseX, mech.mouseY, 10,10);
        mech.line(mech.mouseX - 10, mech.mouseY, mech.mouseX + 10, mech.mouseY);
        mech.line(mech.mouseX, mech.mouseY + 10, mech.mouseX, mech.mouseY - 10);
    }

}