

/*
Вариант 2. Разработать программу для работы со списком ТЕЛЕФОННЫХ
АППАРАТОВ (Telephone). Каждый телефонный аппарат содержит
следующие данные: модель (строка), серийный номер (строка), цвет (строка),
тип телефона – мобильный или нет (логический тип). Заполнить список
начальными значениями (минимум 3) необходимо в коде программы.
Программа должна предоставлять пользователю три функции:
         Добавление телефонного аппарата в список. При этом если пользователь
пытается добавить телефонный аппарат с серийным номером, который
        уже существует, необходимо выводить соответствующее сообщение.
 Удаление телефонного аппарата из списка по его серийному номеру.
 Удаление всех телефонных аппаратов из списка
В результате работы программы после каждой операции (добавления или
удаления) необходимо выводить на экран текущее содержимое списка
телефонов, например:
Panasonic, X35235ZMD, white, false
        Samsung S10, XYZ123456789, black, true
        Iphone X, ASIOS77777QWERTY, black, true
*/

import Homework1_8.Telephone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Practice_1_8 {
    public static ArrayList<Telephone> telephones = new ArrayList<>() {{
        add(new Telephone("Panasonic", "X35235ZMD", "white", false));
        add(new Telephone("Samsung S10", "XYZ123456789", "black", true));
        add(new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true));
    }};

    public static void addTelephone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите модель");
        String model = scanner.nextLine();

        System.out.println("Введите серийный номер");
        String serialNumber = scanner.nextLine();

        System.out.println("Введите цвет");
        String color = scanner.nextLine();

        System.out.println("Это мобильный? (да/нет)");
        boolean isMobile = scanner.nextLine().equals("да");

        for (var item: telephones){
           if (item.getSerialNumber().equals(serialNumber)) {
               System.out.println("Данный серийный номер уже введен!!!!");
            }
        }
        telephones.add(new Telephone(model, serialNumber, color, isMobile));
        printListOfTelephones();
    }

    public static void deleteTelephoneByNumber(String number) {
        Iterator<Telephone> iterator = telephones.iterator();
        while (iterator.hasNext()) {
            String serialNumber = iterator.next().getSerialNumber();
            if (serialNumber.equals(number)) {
                iterator.remove();
            }
        }
    }

    public static void deleteAllTelephone() {
        telephones.clear();
    }

    public static void printListOfTelephones() {
        for (Telephone telephone : telephones) {
            System.out.println(telephone);
        }
    }
    public static void main(String[] args) {
        System.out.println("<Султанов Тимур Азатович; Рибо-04-22; вариант №22>");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - добавить телефон\n2 - удалить телефон\n3 - удалить всё");
        String string = scanner.nextLine();
        if (string.equals("1")) {
            addTelephone();
        } else if (string.equals("2")) {
            System.out.println("Введите номер");
            deleteTelephoneByNumber(scanner.nextLine());
        } else if (string.equals("3")) {
            deleteAllTelephone();
        } else {
            return;
        }
    }
}