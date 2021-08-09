package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
