public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0){
            if(clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if(clientOS >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3(){
        int year = 2104;
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year +" год високосный");
        } else if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год невисокосный");
        }
    }
    public static void task4(){
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Доставка занимает сутки");
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает 3 суотк");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5(){
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " - зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " - весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " - летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " - осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");

        }
    }
}