public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        char color = 'r';

        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else {
            if (color == 'y') {
                System.out.println("Желтый. Внимание.");
            } else {
                System.out.println("Зеленый! Проезд разрешен.");
            }
        }
    }
}