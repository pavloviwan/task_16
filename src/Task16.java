/** Задача №16
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Иван\\IdeaProjects\\task_16\\src\\resources\\task_16.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
