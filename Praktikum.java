import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " это високосный год! ");
        } else {
            System.out.println(year + " не високосный год! ");

        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
            if (year % 4 == 0){
                return true;
            }
        return false;
    }
}