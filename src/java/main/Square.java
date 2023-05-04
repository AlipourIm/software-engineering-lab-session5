package main;

public class Square extends Shape{

    private double side;

    @Override
    double getArea() {
        return 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
