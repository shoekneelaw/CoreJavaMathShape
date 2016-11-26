/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmaticalshape.mathmaticalShape;

import static java.lang.Math.PI;

/**
 *
 * @author user
 */
public class Perimeter {
        private double length,breadth,radius,side1,side2,side3;

    public Perimeter(double length, double breadth, double radius, double side1, double side2, double side3) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    
    public Perimeter() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void perimeterCircle(){
        double perimeter;
        perimeter=2*PI*radius;
        System.out.println("Perimeter of Circle\t"+ perimeter);
    }
    public void perimeterRectangle(){
        double perimeter;
        perimeter=2*(length+breadth);
        System.out.println("The perimeter of rectangel\t"+ perimeter);
    }
     public void perimeterSquare(){
        double perimeter;
        perimeter=2*length;
        System.out.println("The perimeter of Square\t"+ perimeter);
    }
      public void perimeterTriangle(){
        double perimeter;
        perimeter=side1+side2+side3;
        System.out.println("The perimeter of triangle\t"+ perimeter);
    }
}
