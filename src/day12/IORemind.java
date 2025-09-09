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

public class IORemind {

    private static final String PATH = "src/day12/testUserInfo.txt";

    public static void main(String[] args) {
        IORemind test = new IORemind();
        List<TestUser> users = new ArrayList<>();

//        test.saveUserInfoToFile();
//        test.readUserInfoFromFile();

//        test.saveUserInfoToCollection(users);
//        test.saveToFileFromCollection(users);

        test.saveToCollectionFromFile(users);
    }

    // 사용자의 정보를 입력 받아서 파일에 저장하는 메서드
    private void saveUserInfoToFile() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter(PATH, true))) {

            System.out.print("이름을 입력하세요: ");
            String name = br.readLine();

            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("주소를 입력하세요: ");
            String address = br.readLine();

            pw.println(name + " | " + age + " | " + address);
            System.out.println("사용자가 저장되었습니다!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 파일로부터 읽어와서 사용자의 정보를 출력하는 메서드
    private void readUserInfoFromFile() {

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 3건 입력 받아서 Collection에 저장하는 메서드
    private void saveUserInfoToCollection(List<TestUser> users) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 3; i++) {
                System.out.print("이름을 입력하세요: ");
                String name = br.readLine();

                System.out.print("나이를 입력하세요: ");
                int age = Integer.parseInt(br.readLine());

                System.out.print("주소를 입력하세요: ");
                String address = br.readLine();

                users.add(new TestUser(name, age, address));
                System.out.println("사용자가 저장되었습니다!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Collection의 내용을 파일에 저장하는 메서드
    private void saveToFileFromCollection(List<TestUser> users) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, true))) {

            for (TestUser user : users) {
                bw.write(user.getName() + " | " + user.getAge() + " | " + user.getAddress());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 파일의 내용을 읽어서 Collection으로 저장하는 메서드
    private void saveToCollectionFromFile(List<TestUser> users) {

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {

            String data;
            while ((data = br.readLine()) != null) {
                if (data.isBlank()) {
                    continue;
                }

                String[] split = data.split("\\|");
                if (split.length != 3) {
                    continue;
                }

                String name = split[0].trim();
                int age = Integer.parseInt(split[1].trim());
                String address = split[2].trim();

                users.add(new TestUser(name, age, address));
            }

            for (TestUser user : users) {
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
