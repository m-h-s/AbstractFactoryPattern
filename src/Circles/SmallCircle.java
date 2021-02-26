package Circles;

import ShapeFactories.Shape;


public class SmallCircle extends Circle {


  public SmallCircle() {
    super (5);
  }

  public void draw() {
    System.out.println("This is a small circle with radius " + radius);
  }

}