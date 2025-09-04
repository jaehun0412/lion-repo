package day12;

import java.io.*;

public class FileCopyByte {

    public static void main(String[] args) {
        String sourceFile = "src/day12/ioexam.txt";
        String destFile = "src/day12/output.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] buffer = new byte[1024];
            int data;

            while ((data = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, data);
            }

            System.out.println("파일 복사 완료: " + sourceFile + " -> " + destFile);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
