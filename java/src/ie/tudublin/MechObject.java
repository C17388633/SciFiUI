package ie.tudublin;

import processing.core.PVector;

public abstract class MechObject
{
    protected PVector pos;
    protected PVector forward;
    protected float rotation;
    protected float speed;
    protected UI mech;

    public MechObject(UI mech, float x, float y, float rotation, float speed)//YASC yasc
    {
        this.mech = mech;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.rotation = rotation; 
        this.speed = speed;
    }

    public abstract void update();

    public abstract void render();

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the forward
     */
    public PVector getForward() {
        return forward;
    }

    /**
     * @param forward the forward to set
     */
    public void setForward(PVector forward) {
        this.forward = forward;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the mech
     */
    public UI getMech() {
        return mech;
    }

    /**
     * @param mech the mech to set
     */
    public void setMech(UI mech) {
        this.mech = mech;
    }

    

}