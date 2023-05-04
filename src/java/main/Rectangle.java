package main;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return this.width * this.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) throws Exception {
        if (width < 0)
            throw new Exception("Invalid value");
        this.width = width;
    }

    public void setHeight(double height) throws Exception {
        if (height < 0)
            throw new Exception("Invalid value");
        this.height = height;
    }
}
