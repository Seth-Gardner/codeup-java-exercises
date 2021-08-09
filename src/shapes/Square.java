package shapes;

public class Square extends Rectangle{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
