package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/day12/input.txt");
             FileWriter fw = new FileWriter("src/day12/output.txt")) {

            int character;
            while ((character = fr.read()) != -1) {
                fw.write(character);
            }
            System.out.println("텍스트 파일 복사 완료!");

            fw.write("\nabc");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
