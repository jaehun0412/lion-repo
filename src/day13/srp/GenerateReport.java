package day13.srp;

public class GenerateReport {

    public String generateReport(EmployeeRef employee) {
        // 보고서 생성 로직
        return "Report Generated: " + employee.getName() + " " + employee.getSalary();
    }
}
