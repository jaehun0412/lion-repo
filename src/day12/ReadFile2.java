package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile2 {

    public static void main(String[] args) {
        // 파일에서 읽어서 파일에 쓰고 싶다.

        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream("src/day12/IOExam1.java");
            fos = new FileOutputStream("src/day12/ioexam.txt");

            System.out.println(fis.read()); // 한 번 읽었으면 끝!
            System.out.println((char) fis.read());

            // fis.read() -> 파일의 끝이면 -1 리턴, EOF(End OF File)
            int data;
            int count = 0;
/*
        while ((data = fis.read()) != -1) { // 파일의 끝이 아닐 때까지 계속 읽어라.
//            System.out.print((char) data); // 콘솔에 출력
            fos.write(data); // 파일에 출력
            count++;
        }
        System.out.println(count);
*/

            byte[] bytes = new byte[1024];

            while ((data = fis.read(bytes)) != -1) {
                String str = new String(bytes, 0, data);
                System.out.println(str);
                count++;
                fos.write(bytes, 0, data);
            }

            System.out.println(count);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // 실제 파일에 쓰는 것은 누가 할까요? : OS
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
