import Homework1_12.*;

import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите путь к файлу");
    String path = scanner.nextLine();
    LoaderRunnable lr = new LoaderRunnable(path);
    Thread th = new Thread(lr);
    th.start();
}