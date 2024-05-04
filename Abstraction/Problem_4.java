abstract class Abstract {
    public Abstract() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void b_method() {
        System.out.println("This is a normal method of abstract class");
    }

}

class SubClass extends Abstract {

    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }

}

public class Problem_4 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.a_method();
        subClass.b_method();
    }
}
