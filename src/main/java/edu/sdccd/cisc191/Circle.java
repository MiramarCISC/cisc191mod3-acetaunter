package edu.sdccd.cisc191;


import java.util.Objects;

public class Circle  extends Shape {
    private double r1;
    private String name;
    public Circle(String name, double r1){
        super(name);
        this.r1 =r1;
        this.name = name;
        if(r1 <=0){
            throw new IllegalArgumentException("not possible");
        }
    }
    @Override
    public double area() {
        return Math.PI * r1 * r1;
    }

    @Override
    double perimeter() {
        return 2*Math.PI * r1;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle))
            return false;
        Circle other = (Circle) obj;
        return Double.compare(r1, other.r1) == 0
                && Objects.equals(name, other.name);
    }
}