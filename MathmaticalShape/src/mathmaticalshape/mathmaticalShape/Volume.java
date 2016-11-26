/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmaticalshape.mathmaticalShape;

import com.sun.org.apache.xalan.internal.lib.ExsltMath;
import static java.lang.Math.PI;

/**
 *
 * @author user
 */
public class Volume {
    private double radius,length,breadth,height;

    public Volume() {
    }

    public Volume(double radius, double length, double breadth, double height) {
        this.radius = radius;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void volumeCircle(){
        double volume;
        volume=(4/3)*PI*ExsltMath.power(getRadius(), 3);
        System.out.println("Volume of cirlce"+ volume);
    }
    public void volumeRectangle()
    {
        double volume;
        volume=getBreadth()+getLength()+getHeight();
        System.out.println("Volume of rectangle is \t\t"+ volume);
    }
    public void volumeSquare(){
        double volume;
        volume=ExsltMath.power(getLength(), 3);
        System.out.println("The volume of Square is: \t"+volume);
        
    }
    public void volumeTriangle(){
        double volume,areaTriangleForVolume;
        areaTriangleForVolume=(1/2)*getBreadth()*getLength();
        volume=(1/3)*areaTriangleForVolume*getHeight();
        System.out.println("The volume of triangle is "+ volume);
    }
    
}
