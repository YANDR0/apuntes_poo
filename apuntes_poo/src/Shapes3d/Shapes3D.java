package Shapes3d;

public abstract class Shapes3D {

    private double x = 0,y = 0,z = 0;

    public Shapes3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void move(int dx, int dy, int dz){
        this.x = this.x + dx < 0? 0: this.x + dx;
        this.y = this.y + dy < 0? 0: this.y + dy;
        this.z = this.z + dz < 0? 0: this.z + dz;
    }

    @Override
    public String toString() {
        return "a";
    }                       //LUEGO LE MUEVO

    public abstract double area();

    public abstract double volume();

}
