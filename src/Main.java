import javax.swing.*;
import java.sql.SQLData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(("Задача 1"));
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите упрощенную версию для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите упрощенную версию для Android по ссылке");
        }
        System.out.println("Задача 3");
        int dateYear = 2023;
        boolean notYear = true;
        if (dateYear % 4 == 0 || dateYear % 400 == 0) {
            System.out.println("этот год високосный");
        } else if (dateYear % 100 == 0) {
            System.out.println("этот год не високосный");
        } else if (dateYear < 1584) {
            System.out.println("ОШИБКА");
        } else {
            System.out.println("этот год не високосный");
        }
        System.out.println("Задача 4");
        int shipping = 100;
        if (shipping <= 20) {
            System.out.println("Доставка в пределах 20 км занимает 1 сутки.");
        } else if (shipping > 20 && shipping <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км занимает 2 суток");
        } else if (shipping > 60 && shipping < 100) {
            System.out.println("Доставка в пределах 60 км до 100 км занимает 3 суток");
        } else if (shipping >= 100) {
            System.out.println("Доставку свыше 100 км не осуществляем");
        }
        System.out.println("Задача 5");
        byte monthNumber = 4;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка,выберите номер месяца");
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("ЗИМА");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("ВЕСНА");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("ЛЕТО");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("ОСЕНЬ");
                    break;
                default:
                    System.out.println("Ошибка,выберите номер месяца");
            }
        }
    }
}