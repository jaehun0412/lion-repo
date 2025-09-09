package day13.srp;

public class SaveData {

    public void saveToDatabase(EmployeeRef employee) {
        // DB 저장 로직
        System.out.println("Saving to database..." + employee.getName());
    }
}
