package edu.sdccd.cisc191;

import java.util.Objects;

public class Triangle extends Shape{
    private String name;
    private double s1;
    private double s2;
    private double s3;
    public Triangle(String name, double s1, double s2, double s3){
        super(name);
        if(s1 <=0 || s1< 0 || s3<=0){
            throw new IllegalArgumentException("not possible");
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }


    @Override
    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-s1) * (s-s2) * (s3-s));
    }

    @Override
    double perimeter() {
        return s1+s2+s3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangle))
            return false;
        Triangle other = (Triangle) obj;
        return Double.compare(s1, other.s1) == 0 && Double.compare(s2, other.s2) == 0 && Double.compare(s1, other.s1) == 0
                && Objects.equals(name, other.name);
    }
}