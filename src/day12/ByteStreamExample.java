package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) {
        // try-with-resources 활용
        try (FileInputStream fis = new FileInputStream("src/day12/input.txt");
             FileOutputStream fos = new FileOutputStream("src/day12/output.txt")) {

            int byteData;

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("파일 복사 완료");
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류: " + e.getMessage());
        }
    }
}
