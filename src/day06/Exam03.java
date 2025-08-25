package day06;

public class Exam03 {

    public static void main(String[] args) {

        // 비슷한 것들끼리만 가능 (기본 - 숫자, boolean)
        // 객체들 사이의 형변환은 어떤 조건들 사이에서만 가능할까요?
        // 상속 관계에 있을 때만 가능하다!
        Parent2 p = new Child2();

        // 형변환 - 작은 그릇에서 큰 그릇으로 바꿀 때 (묵시적 형변환 가능)
        // 큰 그릇 - 부모, 작은 그릇 - 자식
        Object obj = p; // 묵시적 형변환

        p = (Parent2) obj; // 더 큰 그릇에서 작은 그릇으로 옮겨담을 때 오류!

        Child2 c = (Child2) p; // 가능

        Parent2 pp = new Parent2();

        // 형변환 시 인스턴스가 중요하다!
        if (pp instanceof Child2) {
            Child2 cc = (Child2) pp;
        }
    }
}
