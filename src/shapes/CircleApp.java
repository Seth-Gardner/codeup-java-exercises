package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double newRadius = input.getDouble();
        Circle circle = new Circle(newRadius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
