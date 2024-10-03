 class Main {
    public static void main(String[] args) {
        // 1 task
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // 2 task
        short clientDeviceYear = 2014;
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

        // 3 task
        int year = 2021;
        if (year < 1584 || year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // 4 task
        byte deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        // 5 task
        byte monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Такого месяца нет");
        }
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Зима");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Весна");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Лето");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Осень");
                break;
        }
    }
}