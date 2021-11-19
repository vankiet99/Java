package Assignment7_KietNV;

public class Circle extends Shape implements Circle1, Circle2 {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius, String color, Boolean filled) {
        super();
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getParimetter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return  super.toString() + "radius=" + radius;
    }



}


