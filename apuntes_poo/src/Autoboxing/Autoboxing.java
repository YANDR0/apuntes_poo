package Autoboxing;

public class Autoboxing {

    public static void main(String[] args) {
        int i1 = 567;
        Integer I1 = i1; //new Integer(i1);     Autoboxing
        double d1 = 6.78;
        Double D1 = d1; //new Double(d1);       Autoboxing

        int i2 = I1; //I1.intValue();           Autounboxing
        double d2 = D1; //D1.doubleValue();     Autounboxing
    }

}
