import Homework1_12.*;

import java.util.Scanner;

public static void main(String[] args) {
    System.out.println("Султанов Тимур Азатович РИБО-04-22 Вариант №22");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите путь к файлу");
    String path = scanner.nextLine();
    LoaderRunnable lr = new LoaderRunnable(path);
    Thread th = new Thread(lr);
    th.start();
}
