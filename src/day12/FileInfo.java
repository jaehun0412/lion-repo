package day12;

import java.io.File;
import java.io.IOException;

public class FileInfo {

    public static void main(String[] args) {
        File f1 = new File("src/day12/output.dat");
        File f2 = new File("src/day12/ioexam.txt");

        if (!f1.exists()) {
            System.out.println(f1.getName() + "은 존재하지 않습니다.");
        }
        if (!f2.exists()) {
            System.out.println(f2.getName() + "은 존재하지 않습니다.");
        }

/*
        if (f1.exists()) {
            try {
                System.out.println("f1.length() = " + f1.length());
                System.out.println("f1.getAbsolutePath() = " + f1.getAbsolutePath());
                System.out.println("f1.getCanonicalPath() = " + f1.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("오류 발생: " + e.getMessage());
            }
        }
*/

        if (f2.exists()) {
            try {
                System.out.println("f2.length() = " + f2.length());
                System.out.println("f2.getPath() = " + f2.getPath());
                System.out.println("f2.getAbsolutePath() = " + f2.getAbsolutePath()); // 절대 위치
                System.out.println("f2.getCanonicalPath() = " + f2.getCanonicalPath()); // 절대 위치 (더 실제 위치)
            } catch (IOException e) {
                System.out.println("오류 발생: " + e.getMessage());
            }
        }
        System.out.println("f2.getName() = " + f2.getName());
        System.out.println("f2.getParent() = " + f2.getParent());
        System.out.println("f2.getParentFile().getName() = " + f2.getParentFile().getName());
    }
}
