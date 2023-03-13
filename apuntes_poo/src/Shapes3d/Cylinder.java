package Shapes3d;

public class Cylinder extends Shapes3D{

    public static final double MIN_RADIUS = 0.1, MIN_HEIGHT = 0.2;
    private double radio, height;

    public Cylinder(double x, double y, double z, double r, double h){
        super(x, y, z);
        this.radio = Math.max(r, MIN_RADIUS);
        this.height = Math.max(h, MIN_HEIGHT);
    }

    public double getRadio() {
        return radio;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area(){
        return 1;
    }

    @Override
    public double volume(){
        return 1;
    }

}
