package day13;

public class LTV implements TV {

    private boolean isOn;
    private int sound;

    public void turnOn() {
        isOn = true;
        System.out.println("LTV is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("LTV is off.");
    }

    @Override
    public void volumeUp() {
        sound++;
        System.out.println("LTV volume up");
    }

    @Override
    public void volumeDown() {
        sound--;
        System.out.println("LTV volume down");
    }
}
