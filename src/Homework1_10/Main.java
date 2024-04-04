package Homework1_10;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите путь к исходному файлу: ");
            String File_put = scanner.nextLine();
            FileHandler fileHandler = new FileHandler(File_put);
            String[] lines = fileHandler.readLines();
            String[] modifiedLines = TextModifier.reverseLines(lines);
            String outputFilePath = File_put.replace(".txt", "_modified.txt");
            //fileHandler.writeLines(modifiedLines, outputFilePath);
            System.out.println("Файл изменен " + File_put + "_modified.txt");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
