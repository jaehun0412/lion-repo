package day11;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) throws FileNotFoundException {
        // 자바 9+ try 블럭 외부에서 선언한 변수도 자원으로 사용 가능
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // 파일 복사 예제
        try (br;
             FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            System.out.println("파일 복사 완료");
        } catch (IOException e) {
            System.err.println("파일 처리 중 오류: " + e.getMessage());
        }
        // 모든 리소스가 자동으로 close()
    }
}