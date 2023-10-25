public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        //task3
        int year = 2021;
        if (year % 400 == 0) {
                System.out.println(year + " - високосный год");
        } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " - високосный год");
        } else {
                System.out.println(year + " - не високосный год");
        }

        //task4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        //task5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет ");
        }
    }
}