package com.company;

/**
 * Created by uitsc_000 on 24.01.2016.
 */
public abstract class shape {
    protected String color = "red";
    public abstract void  draw();
    public shape(String color){
        this.color = color;
    }
}
