class Shape
{
    void show()
    {
        System.out.println("This is shape class's show");
    }

    void getInfo()
    {
        System.out.println("This is shape class's getInfo");
    }
}

class Circle extends Shape
{
    @Override
    void show()
    {
        System.out.println("This is circle class's show");
    }
}

class Rectangle extends Shape
{
    @Override
    void show()
    {
        System.out.println("This is rectangle class's show");
    }
}

public class One
{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.show();
        s.getInfo();

        Circle c = new Circle();
        c.show();
        c.getInfo();

        Rectangle r = new Rectangle();
        r.show();
        r.getInfo();
    }
}
