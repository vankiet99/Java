package Assignment7_KietNV;

public class Square extends Retangle {
    private double side;
    public Square() {
        side = 10;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side =side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLength(double length) {
        super.setLength(length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "side=" + side;
    }
}

