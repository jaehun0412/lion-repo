package day13.srp;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeRef emp = new EmployeeRef("Kim", 4500);

        CalculatePay calculatePay = new CalculatePay();
        double pay = calculatePay.calculatePay(emp);
        System.out.println("pay = " + pay);

        SaveData data = new SaveData();
        data.saveToDatabase(emp);

        GenerateReport report = new GenerateReport();
        String generatedReport = report.generateReport(emp);
        System.out.println(generatedReport);
    }
}
