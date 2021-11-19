package Assignment7_KietNV;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        color = "red";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0;

    }

    public double getParimetter(){

        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }

}


