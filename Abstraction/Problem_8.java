interface smartTVremote {
    void powerOn();
}

interface TVremote extends smartTVremote {
    void powerOff();
}

class TV implements TVremote {

    @Override
    public void powerOn() {
        System.out.println("Power is on now");
    }

    @Override
    public void powerOff() {
        System.out.println("Power is off now");
    }

}

public class Problem_8 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();
        tv.powerOff();
    }
}
