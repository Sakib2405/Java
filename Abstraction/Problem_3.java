abstract class Marks {
    abstract int getPercentage();
}

class A extends Marks {
    int subject_one;
    int subject_two;
    int subject_three;

    public A(int subject_one, int subject_two, int subject_three) {
        this.subject_one = subject_one;
        this.subject_two = subject_two;
        this.subject_three = subject_three;
    }

    @Override
    int getPercentage() {
        return (subject_one + subject_two + subject_three) * 100 / 300;
    }

}

class B extends Marks {
    int subject_one;
    int subject_two;
    int subject_three;
    int subject_four;

    public B(int subject_one, int subject_two, int subject_three, int subject_four) {
        this.subject_one = subject_one;
        this.subject_two = subject_two;
        this.subject_three = subject_three;
        this.subject_four = subject_four;
    }

    @Override
    int getPercentage() {
        return (subject_one + subject_two + subject_three + subject_four) * 100 / 400;
    }

}

public class Problem_3 {
    public static void main(String[] args) {
        A a = new A(100, 80, 65);
        System.out.println(a.getPercentage());

        B b = new B(100, 80, 65, 75);
        System.out.println(b.getPercentage());
    }
}
