abstract class Animals {
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
    }
}

class Dogs extends Animals {
    @Override
    void cats() {
    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }
}

public class Problem_5 {
    public static void main(String[] args) {
        Cats c = new Cats();
        c.cats();

        Dogs d = new Dogs();
        d.dogs();
    }
}
