package test_3;

import rgb.RGBCOLOR;

public class Main {

    public static void main(String[] args) {
        RGBCOLOR c1 = new RGBCOLOR();
        RGBCOLOR c2 = new RGBCOLOR(80,200, 120, "Esmeralda");
        RGBCOLOR c3 = new RGBCOLOR(220, 20, 60, "Carmesí");
        RGBCOLOR c4 = new RGBCOLOR(18, 10, 143, "Azul Marino");

        RGBCOLOR c5 = new RGBCOLOR(c2.getCyan(), c2.getMagenta(), c2.getYellow(), "Esmeraldan't");

        System.out.println(String.format("El color del c2 es = %X",c3.getRGB()));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());

        RGBCOLOR c6 = c2.clone();

        System.out.println(c6.toString());
    }
}