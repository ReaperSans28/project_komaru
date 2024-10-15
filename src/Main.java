class Main {
    // 1 task
    public static void isHighGradeYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // 2 task
    public static void version(int clientOS, int clientDeviceYear) {
        String versionMessage;
        if (clientDeviceYear <= 2015) {
            versionMessage = "облегченную версию приложения";
        } else {
            versionMessage = "версию приложения";
        }
        if (clientOS == 0) {
            System.out.println("Установите " + versionMessage + " для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите " + versionMessage + " для Android по ссылке");
        } else {
            System.out.println("Неверная операционная система.");
        }
    }

    // 3 task
    public static void cardDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        isHighGradeYear(2021);
        version(1, 2016);
        cardDelivery(40);
    }
}