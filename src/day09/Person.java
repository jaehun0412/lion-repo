package day09;

import java.util.Objects;

public class Person {

    private String name;
    private String idNumber;
    private String address;
    private String PhoneNumber;

    public Person(String name, String idNumber, String address, String phoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.address = address;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name) && Objects.equals(idNumber, person.idNumber) && Objects.equals(address, person.address) && Objects.equals(PhoneNumber, person.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idNumber, address, PhoneNumber);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", address='" + address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
