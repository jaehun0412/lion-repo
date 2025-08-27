package day07;

// 추상 클래스
public abstract class Animal {

    private String name;

    public void eat() {
        System.out.println("먹는다");
    }

    public void walk() {
        System.out.println("걷다");
    }

    // 이 클래스를 상속받아 사용할 클래스들에게 강제성을 부여
    // 해당 기능을 일관성 있게 구현하도록 제시
    public abstract void makeSound();
}
