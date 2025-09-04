package day12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputExam {

    public static void main(String[] args) {
        // 원시데이터 타입으로 파일에 쓰는 기능을 제공
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/day12/dataOutput.txt"))) {

            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeInt(10);
            dos.writeDouble(Double.MAX_VALUE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
