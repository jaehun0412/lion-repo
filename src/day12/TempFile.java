package day12;

import java.io.File;
import java.io.IOException;

public class TempFile {

    public static void main(String[] args) {

        try {
            File tempFile = File.createTempFile("temp_", ".txt", new File("src/day12"));
            System.out.println("임시 파일 생성: " + tempFile.getAbsolutePath());
            System.out.println("30초 동안 멈춰있습니다.");

            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            tempFile.deleteOnExit(); // JVM이 종료될 때 임시파일 자동으로 삭제

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
