abstract class Parent {
    abstract void message();
}

class First extends Parent {
    @Override
    void message() {
        System.out.println("This is First subclass");
    }
}

class Second extends Parent {
    @Override
    void message() {
        System.out.println("This is Second subclass");
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        First first = new First();
        first.message();

        Second second = new Second();
        second.message();
    }
}
