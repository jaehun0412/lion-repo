package day07;

public class Pen {

    public void write() {
        System.out.println("Pen.write");
    }
    // 오버라이딩은 상속에서만 가능

    public static void main(String[] args) {
        BallPen pen = new BallPen();
        pen.write();
        pen.write("msg");
    }
}

class BallPen extends Pen {
    public void write(String message) {
        System.out.println("BallPen.write");
    }
}
