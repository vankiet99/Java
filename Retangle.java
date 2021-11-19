package Assignment7_KietNV;

public class Retangle extends Shape{
    private double width;
    private double length;

    public Retangle() {
        width = 1.0;
        length = 1.0;
    }
    public Retangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + "width=" + width + ", length=" + length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getParimetter() {
        return (2*length)+(2*width);
    }
}


