package Shapes3d;

public class Box extends Shapes3D{
    public static final double MIN_WIDHT = 0.1, MIN_HEIGHT = 0.1, MIN_LARGE = 0.1;
    private double widht, height, large;

    public Box(double x, double y, double z, double w, double h, double l){
        super(x, y, z);
        this.widht = Math.max(w, MIN_WIDHT);
        this.height = Math.max(h, MIN_HEIGHT);
        this.large = Math.max(l, MIN_LARGE);

    }

    public double getWidht() {
        return widht;
    }

    public double getHeight() {
        return height;
    }

    public double getLarge() {
        return large;
    }

    @Override
    public double area(){
        return 2*(this.widht * this.height + this.widht * this.large + this.height * this.large);
    }

    @Override
    public double volume(){
        return this.widht * this.height * this.large;
    }
}
