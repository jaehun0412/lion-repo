package day12;

import java.io.*;

public class LogFileProcessor {
    public static void main(String[] args) {
        String inputFile = "src/day12/access.log";
        String outputFile = "src/day12/errors.log";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintWriter pw = new PrintWriter(
                     new BufferedWriter(new FileWriter(outputFile)))) {

            String line;
            int totalLines = 0;
            int errorLines = 0;

            while ((line = br.readLine()) != null) {
                totalLines++;

                // ERROR를 포함한 라인만 추출
                if (line.contains("ERROR")) {
                    pw.println("[" + totalLines + "]" + line);
                    errorLines++;
                }
            }

            // 통계 정보 추가
            pw.println("\n=== 로그 분석 결과 ===");
            pw.println("전체 라인: " + totalLines);
            pw.println("오류 라인: " + errorLines);
            pw.printf("오류율: %.2f%%\n", (errorLines * 100.0 / totalLines));

            System.out.println("로그 파일 처리 완료!");
            System.out.println("오류 로그가 " + outputFile + "에 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("파일 처리 오류: " + e.getMessage());
        }
    }
}