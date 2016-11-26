/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmaticalshape.mathmaticalShape;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the choice");
            System.out.println("1. Area");
            System.out.println("2. Perimeter");
            System.out.println("3. Volume");
            System.out.println("4. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Area a = new Area();
                    System.out.println("\t\tEnter the choice");
                    System.out.println("1. \t\t\tArea of Circle");
                    System.out.println("2. \t\t\tArea of Rectangle");
                    System.out.println("3. \t\t\tArea of Triangle");
                    System.out.println("4. \t\t\tArea of Square");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("\t\t\t\tEnter the radius of circle");
                            a.setRadius(input.nextDouble());
                            a.areaCircle();
                            break;
                        case 2:
                            System.out.println("\t\t\t\tEnter the length and breadth of Recatangle");
                            a.setLength(input.nextDouble());
                            a.setBreadth(input.nextDouble());
                            a.areaRectangle();

                            break;
                        case 3:
                            System.out.println("\t\t\t\tEnter the base and height of triangle");
                            a.setBreadth(input.nextDouble());
                            a.setHeight(input.nextDouble());
                            break;
                        case 4:
                            System.out.println("\t\t\t\tEnter the length of square");
                            a.setLength(input.nextDouble());
                            a.areaSquare();
                            break;
                    }
                    break;
                case 2:
                    Perimeter pr = new Perimeter();
                    System.out.println("\t\tEnter the choice");
                    System.out.println("1. \t\t\tPerimeter of Circle");
                    System.out.println("2. \t\t\tPerimeter of Rectangle");
                    System.out.println("3. \t\t\tPerimeter of Triangle");
                    System.out.println("4. \t\t\tPerimeter of Square");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("\t\t\t\tenter the radius of circle");
                            pr.setRadius(input.nextDouble());
                            pr.perimeterCircle();

                            break;
                        case 2:
                            System.out.println("\t\t\t\tEnter the lenght and beadth of Rectangle");
                            pr.setLength(input.nextDouble());
                            pr.setBreadth(input.nextDouble());
                            pr.perimeterRectangle();
                            break;
                        case 3:
                            System.out.println("Enter the three sides of Triangle ");
                            pr.setSide1(input.nextDouble());
                            pr.setSide2(input.nextDouble());
                            pr.setSide3(input.nextDouble());
                            pr.perimeterTriangle();
                            break;
                        case 4:
                            System.out.println("\t\t\t\tEnter the length of square");
                            pr.setLength(input.nextDouble());
                            pr.perimeterSquare();
                            break;

                    }
                    break;
                case 3:
                    Volume v = new Volume();
                    System.out.println(" \t\t1.Volume of Circle");
                    System.out.println(" \t\t2.Volume of Rectangle");
                    System.out.println(" \t\t3.Volume of Triangle");
                    System.out.println(" \t\t4.Volume of Square");
                    int choice4 = input.nextInt();
                    switch (choice4) {
                        case 1:
                            System.out.println("\t\t\tEnter the radius of circle");
                            v.setRadius(input.nextDouble());
                            v.volumeCircle();
                            break;
                        case 2:
                            System.out.println("\t\t\tEnter the length,breadth and height of rectangle");
                            v.setLength(input.nextDouble());
                            v.setBreadth(input.nextDouble());
                            v.setHeight(input.nextDouble());
                            v.volumeRectangle();

                            break;
                        case 3:
                            System.out.println("\t\t\tEnter the length breadth and height of triangle");
                            v.setLength(input.nextDouble());
                            v.setBreadth(input.nextDouble());
                            v.setHeight(input.nextDouble());
                            v.volumeTriangle();
                            break;
                        case 4:
                            System.out.println("\t\t\tEnter the length of square");
                            v.setLength(input.nextDouble());
                            v.volumeSquare();
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }

    }
}
