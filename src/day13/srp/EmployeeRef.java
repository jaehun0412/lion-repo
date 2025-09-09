package day13.srp;

public class EmployeeRef {
    private String name;
    private double salary;

    public EmployeeRef(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}