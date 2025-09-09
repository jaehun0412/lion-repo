package day13;

public class TVUser {

    public static void main(String[] args) {
//        STV tv = new STV();
//        LTV tv = new LTV();

//        TV tv = new LTV();
//        TV tv = new STV();

        TV tv = TVFactory.getTV("l");
//        TV tv = TVFactory.getTV("s");

        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();
    }
}
