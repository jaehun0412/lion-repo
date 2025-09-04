package day12;

import java.io.File;

public class FileList {

    public static void main(String[] args) {
        File f = new File("src/day12");

        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName());
                System.out.print("\t");
                if (files[i].isDirectory()) {
                    System.out.println("디렉토리");
                } else {
                    System.out.print("파일\t");
                    System.out.println(files[i].length());
                }
            }
        } else {
            System.out.println("디렉토리가 아닙니다.");
        }
    }
}
