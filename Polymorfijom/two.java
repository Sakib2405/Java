class SuperClass {
    int data1;

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

}

class SubClass extends SuperClass {
    int data2;

    public SubClass(int data1, int data2) {
        super.setData1(data1);
        this.data2 = data2;
    }

    // overloaded constructor
    public SubClass() {
        this(0, 0);
    }

    public String checkCondition() {
        if (super.data1 == 10 && data2 == 15) {
            return "Condition True!";
        }
        return "Condition False!";
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    // overriding methods [OPTIONAL]
    @Override
    public void setData1(int data1) {
        super.setData1(data1);
    }

    @Override
    public int getData1() {
        return super.getData1();
    }
}

public class Two {
    public static void main(String[] args) {
        SubClass s = new SubClass(10, 15);
        System.out.println(s.checkCondition());

        s.setData1(0);
        System.out.println(s.getData1());
        System.out.println(s.checkCondition());
    }
}
