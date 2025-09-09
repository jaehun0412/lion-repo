package day13.srp;

public class CalculatePay {

    public double calculatePay(EmployeeRef employee) {
        // 급여 계산 로직 (기본급 + 10% 보너스)
        double basicSalary = employee.getSalary();
        double bonus = basicSalary * 0.1;
        return basicSalary + bonus;
    }
}
