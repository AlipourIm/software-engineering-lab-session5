package main;

public class Square extends Shape{

    private double side;

    @Override
    double getArea() {
        return this.side * this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws Exception {
        if (side < 0)
            throw new Exception("Invalid value");
        this.side = side;
    }
}
