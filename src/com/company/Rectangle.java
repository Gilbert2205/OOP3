package com.company;

/**
 * Created by uitsc_000 on 24.01.2016.
 */
public class Rectangle extends shape{
    protected int x,y,x1,y1;
    public Rectangle(int x, int y, int x1, int y1, String color){
        super(color);
        this.x = x;
        this.y = y;
        this.x1=x1;
        this.y1=y1;
    }
    public void draw(){
        System.out.println("Drawing rectangle(x= " + x+" y= " +y +" , x1= " + x1 + " , y1= " + y1 + " , color= " + super.color+")");
    }
}
