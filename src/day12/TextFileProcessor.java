package day12;

import java.io.*;

public class TextFileProcessor {

    public static void main(String[] args) {
        String inputFile = "src/day12/ioexam.txt";
        String outputFile = "src/day12/output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {

            String line;
            int lineNum = 1;

            while ((line = br.readLine()) != null) {
                pw.println(lineNum + ": " + line);
                lineNum++;
            }

            System.out.println("텍스트 파일 처리 완료!");
            pw.write("\n총 " + lineNum + "줄 처리됨");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
