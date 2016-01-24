package com.company;

/**
 * Created by uitsc_000 on 24.01.2016.
 */
public class Circle extends shape {
    protected int x,y,r;
    public Circle(int x, int y, int r, String color){
        super(color);
        this.x = x;
        this.y=y;
        this.r=r;
    }
    public void draw(){
        System.out.println("Drawing circle(x= " + x+" y= " +y +" , radius= " + r + " , color= " + super.color+")");
    }
}
