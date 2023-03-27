package tests;

import DateTime.Date;
import Shapes3d.Shapes3D;
import Shapes3d.Sphere;

import javax.swing.*;

public class test_6 {

    public static void main(String[] args){

        Shapes3D sphere = new Sphere(1,2,3,4);

        Shapes3D pyramid = new Shapes3D(1,2,3) {
            @Override
            public double area() {
                return 2;
            }

            @Override
            public double volume() {
                return 1;
            }

            @Override
            public String toString(){
                return "Pirámide\n" + super.toString();
            }
        };

        System.out.println(pyramid + "\n");

        Date d1 = new Date(){
            @Override
            public String toString(){
                setFormat(2);
                return "[" + super.toString() + "]";
            }

        };

        System.out.println(d1);

    }
}
