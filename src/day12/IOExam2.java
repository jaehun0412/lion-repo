package day12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 사용자의 정보 (이름, 전화번호, 주소)를 입력 받아서 파일에 저장하는 메서드
 * 파일로부터 읽어와서 사용자의 정보를 출력하는 메서드
 * <p>
 * n건 정도를 입력 받아서 Collection에 저장하는 메서드
 * Collection의 내용을 파일에 저장하는 메서드
 * 파일의 내용을 읽어서 Collection으로 저장하는 메서드
 */
public class IOExam2 {

    public static void main(String[] args) {

        IOExam2 exam = new IOExam2();

        String path = "src/day12/userInfo.txt";
//        exam.saveUserInfo(path);
//        exam.readUserInfo(path);

        List<Person> personList = new ArrayList<>();
//        exam.saveUserInfo(personList);
//        exam.readUserInfo(personList, path);

        exam.readUserInfoSaveCollection(personList, path);

    }

    // 사용자의 정보 (이름, 전화번호, 주소)를 입력 받아서 파일에 저장하는 메서드
    void saveUserInfo(String path) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter(path))) {

            for (int count = 0; count < 3; count++) {
                System.out.print("이름: ");
                String name = br.readLine();
                System.out.print("전화번호: ");
                String phoneNumber = br.readLine();
                System.out.print("주소: ");
                String address = br.readLine();

                pw.println(name + " | " + phoneNumber + " | " + address);
            }

            System.out.println("사용자 정보가 저장되었습니다.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // 파일로부터 읽어와서 사용자의 정보를 출력하는 메서드
    void readUserInfo(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String userInfo;
            while ((userInfo = br.readLine()) != null) {
                System.out.println(userInfo);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // n건 정도를 입력 받아서 Collection에 저장하는 메서드
    void saveUserInfo(List<Person> personList) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int count = 0; count < 3; count++) {
                System.out.print("이름: ");
                String name = br.readLine();
                System.out.print("전화번호: ");
                String phoneNumber = br.readLine();
                System.out.print("주소: ");
                String address = br.readLine();

                personList.add(new Person(name, phoneNumber, address));
            }

            System.out.println("사용자 정보가 저장되었습니다.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    // Collection의 내용을 파일에 저장하는 메서드
    void readUserInfo(List<Person> personList, String path) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(path, true))) {

            for (Person person : personList) {
                pw.println(person.getName() + " | " + person.getPhoneNumber() + " | " + person.getAddress());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // 파일의 값을 읽어서 Collection에 저장하는 메서드
    void readUserInfoSaveCollection(List<Person> personList, String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String data;

            while ((data = br.readLine()) != null) {
                String[] splits = data.split("\\|");
                personList.add(new Person(splits[0], splits[1], splits[2]));
            }

            for (Person person : personList) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
