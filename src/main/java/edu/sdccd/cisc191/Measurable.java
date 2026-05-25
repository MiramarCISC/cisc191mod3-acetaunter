package edu.sdccd.cisc191;

import java.awt.*;

public interface Measurable extends Comparable<Shape> {
    double area();

    int compareTo(Shape other);
}
