package com.mykhaylenko.dessign.prototype.shape;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public abstract class Shape implements Cloneable{

    private int id;
    protected String type;

    public abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
