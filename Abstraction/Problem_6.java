abstract class Shape {
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

class Area extends Shape {
    @Override
    void RectangleArea(int length, int breadth) {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    @Override
    void SquareArea(int side) {
        System.out.println("Area of square: " + side * side);
    }

    @Override
    void CircleArea(int radius) {
        System.out.println("Area of circle: " + 3.14 * radius * radius);
    }
}

public class Problem_6 {
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(10, 20);
        a.SquareArea(10);
        a.CircleArea(10);
    }
}
