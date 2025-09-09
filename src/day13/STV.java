package day13;

// 전원을 켜다, 끄다, 소리를 올리다, 줄이다
public class STV implements TV {

    private boolean isOn;
    private int volume;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("STV is on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("STV is off.");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("STV volume up");
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("STV volume down");
    }
}
