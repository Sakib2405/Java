abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int balance = 100;

    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    int balance = 150;

    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    int balance = 200;

    public int getBalance() {
        return balance;
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println(a.getBalance());

        BankB b = new BankB();
        System.out.println(b.getBalance());

        BankC c = new BankC();
        System.out.println(c.getBalance());
    }
}
