package test_2;

import shapes2d.Rectangle;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4,2);
        Rectangle r2 = new Rectangle(-2, -1);
        Rectangle r3 = new Rectangle();

        //r1.setBase(4);
        //r1.setHeight(2);

        r1.imprimir();

        //r2.setBase(-2);
        //r2.setHeight(-1);

        r2.imprimir();

        r3.setBase(r1.getBase()*2);
        r3.setHeight(r1.getHeight()*2);

        r3.imprimir();

        Rectangle r4 = new Rectangle(3);
        r4.imprimir();

        Rectangle r5 = new Rectangle(3,3);

        System.out.println(r4.equals(r5));


        //System.out.println(r1);
        //JOptionPane.showMessageDialog(null, r4);
    }


}