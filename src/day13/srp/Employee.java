package day13.srp;

/**
 * SRP 원칙을 지키도록 리팩토링
 */
public class Employee {
    private String name;
    private double salary;

    // 직원 정보 관리 + 급여 계산 + 데이터베이스 저장을 모두 담당
    public double calculatePay() {
        // 급여 계산 로직
        return 0;
    }

    public void saveToDatabase() {
        // DB 저장 로직
    }

    public String generateReport() {
        // 보고서 생성 로직
        return null;
    }
}