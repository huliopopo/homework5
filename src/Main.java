public class Main {
    public static void main(String[] args) {
        //Task1
        byte clientOS = 1;
        if (0 == clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (1 == clientOS) System.out.println("Установите версию приложения для Android по ссылке");
        //Task2
        //0 - iOS; 1 - Android
        System.out.println("Task2");
        byte os = 0;
        short clientDeviceYear = 2018;
        if (0 == os && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для iOS по ссылке");
        } else if (0 == os && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        if (1 == os && clientDeviceYear < 2015) {
            System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для Android по ссылке");
        } else if (1 == os && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        //Task3
        int year = 1904;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Високосный");
            } else System.out.println("Невисокосный");
        }
        //Task4
        int deliveryDistance = 88;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        //Task5
        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }


    }
}