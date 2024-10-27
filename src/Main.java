import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 2400;
        printLeap(year, checkLeap(year));
    }

    public static boolean checkLeap(int year) {
        return year % 100 != 0 && year % 4 == 0 || year %400 == 0;
    }

    public static void printLeap(int year, boolean leap) {
        if (leap) {
            System.out.printf("%d - это високосный год.\n", year);
        } else {
            System.out.printf("%d - это не високосный год.\n", year);
        }
    }

    public static void task2() {
        int clientDeviceOS = 1;
        int clientDeviceYear = 2022;
        printMessage(clientDeviceOS, clientDeviceYear);
    }

    public static void printMessage(int os, int deviceYear) {
        System.out.print("Установите ");
        if (deviceYear < LocalDate.now().getYear()) {
            System.out.print("облегчённую ");
        }
        System.out.print("версию приложения для ");
        if (os > 0) {
            System.out.print("Android по ссылке.\n");
        } else {
            System.out.print("IOS по ссылке.\n");
        }
    }

    public static void task3() {
        int deliveryDistance = 95;

        switch (calculateDeliveryDays(deliveryDistance)) {
            case 0:
                System.out.println("Доставки нет.");
                break;
            case 1:
                System.out.println("Доставка займёт 1 день.");
                break;
            case 2:
                System.out.println("Доставка займёт 2 дня.");
                break;
            case 3:
                System.out.println("Доставка займёт 3 дня.");
                break;
        }
    }



    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return 0;
        }
        int deliveryDays = 2;
        if (distance < 20) {
            deliveryDays--;
        } else if (distance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}