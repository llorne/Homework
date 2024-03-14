package Homework1_6;
import java.util.Scanner;

public class SellerApplication {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Seller seller = new Seller();
        System.out.println("Султанов Тимур РИБО-04-22 Вариант: 2 " );
        System.out.println("Введите название производителя: ");
        Telephone telephone = new Telephone(scanner.nextLine());
        seller.modify(telephone);
        System.out.println(telephone);
    }
}