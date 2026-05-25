package edu.sdccd.cisc191;

import java.util.Objects;

public class Rectangle extends Shape  {
    private String name;
    private double s1;
    private double s2;

    public Rectangle(String name, double s1, double s2){
        super(name);
        if(s1 <=0 || s2< 0 ){
            throw new IllegalArgumentException("not possible");
        }
        this.s1 = s1;
        this.s2 = s2;


    }

    @Override
    public double area() {
        return s1 * s2;
    }



    @Override
    double perimeter() {
        return 2* s1+2* s2;
    }
    public boolean equals(Object robj) {
        if (this == robj) {
            return true;
        }
        if (!(robj instanceof Rectangle))
            return false;
        Rectangle other = (Rectangle) robj;
        return Double.compare(s1, other.s1) == 0 && Double.compare(s2, other.s2) == 0
                && Objects.equals(name, other.name);
    }
}
