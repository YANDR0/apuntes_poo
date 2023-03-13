package Shapes3d;

public class Sphere extends Shapes3D{

    public static final double MIN_RADIUS = 0.1;
    private double radio;

    public Sphere(double x, double y, double z, double r){
        super(x, y, z);
        this.radio = Math.max(r, MIN_RADIUS);
    }

    public double getRadio() {
        return radio;
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
