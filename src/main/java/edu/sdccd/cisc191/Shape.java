package edu.sdccd.cisc191;

public abstract class Shape implements Measurable, Comparable<Shape> {
    protected String name;

    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }



    public abstract double area();
    abstract double perimeter();
    @Override
    public int compareTo(Shape other){
        return this.name.compareTo(other.name);
    }

    public String describe(){
        return "This shape is called a " + name;
    }

}