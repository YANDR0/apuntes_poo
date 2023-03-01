package shapes2d;

import java.util.Objects;

public class Rectangle{
    private double base = 1;

    private double height = 1;

    public Rectangle(){ }

    public Rectangle(float side){
        this(side, side);
    }

    public Rectangle(double base, double height){
        setBase(base);
        setHeight(height);
    }

    public void setBase(double b){
        if(b <= 0) return;
        base = b;
    }
    public void  setHeight(double height){
        if(height <= 0) return;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }
    public double getHeight(){
        return this.height;
    }

    public double area(){
        return base * height;
    }

    public double perimetro(){
        return 2*(base + height);
    }

    public void imprimir(){
        System.out.println(String.format("(%.1f x %.1f)", base, height));
    }

    @Override
    public String toString() {
        return String.format("[ Base: %.1f, height: %.1f, area: %.1f, perimeter: %.1f ]", base, height, area(),perimetro());
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Rectangle))
            return false;
        Rectangle rec = (Rectangle)obj;
        return (this.height == rec.height && this.base == rec.base);
    }


}
