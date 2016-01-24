package com.company;

public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box(10,12);
//        Box box2 = new Box (11,12);
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//        System.out.println(box1.equals(box2));



//        Box sd= new Box("red");
//        System.out.println(sd);
//        System.out.println(Box.getCountInstance());
//        System.out.println(Box.count);
        shape s[] = new shape[3];
        s[0] = new Circle (10,10,5,"black");
        s[1] = new Rectangle (10,10,50,50,"yellow");
        s[2] = new Circle (10,10,5,"green");

        for(int i=0; i<s.length;i++)
            s[i].draw();
    }



}
