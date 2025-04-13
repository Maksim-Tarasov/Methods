import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 1987;
        checkLeapYear(year);

        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOS(clientOS, clientDeviceYear);

        int deliveryDistance = 13;
        int days = calculateDays(deliveryDistance);
        if (days > 0) {
            System.out.print("Потребуеться дней на доставку: " + days);
        } else {
            System.out.println("Доставка не возможна");
        }


    }

    public static void checkLeapYear(int year) {
        if (year < 1584) {
            System.out.println(year + " год вне григорианского календаря");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS  ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android ");
        } else {
            System.out.println("Установите облегчённую версию приложения для iOS по ");
        }
    }

    public static int calculateDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}




