 class Main {
    public static void main(String[] args) {

        int pyaterka = 55555;
        byte minecraft = 16;
        short mista = 4444;
        long sleepers = 999999999999999999L;
        float pi = 3.14f;
        double pi2 = 3.1415926535897932384626433832795028841971;

        float numb = 27.12f;
        long druid = 987678965549L;
        double a = 2.786;
        short b = 569;
        short minus = -159;
        short plus = 27897;
        byte c = 67;

        var LudmilaPavlovnasClass = 23;
        var AnnaSergeevnasClass = 27;
        var EkaterinaAndreevna = 30;
        var totalPaper = 480;
        var totalStudents = LudmilaPavlovnasClass + AnnaSergeevnasClass + EkaterinaAndreevna;
        var paperForOneStudent = totalPaper / totalStudents;
        System.out.println(paperForOneStudent);

        var bottlesPerTwoMinutes = 16;
        var bottlesPerMinute = bottlesPerTwoMinutes / 2;
        var bottlesPerTwentyMinutes = bottlesPerTwoMinutes * 20;
        var bottlesPerDay = bottlesPerMinute * 1440;
        var bottlesPerThreeDays = bottlesPerDay * 3;
        var bottlesPerMonth = bottlesPerThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesPerMonth + " штук бутылок");

        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int totalClasses = totalCans / (whitePerClass + brownPerClass);
        int totalWhiteCans = totalClasses * whitePerClass;
        int totalBrownCans = totalClasses * brownPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        short bananaWeight = 80;
        short milkWeight = 100;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        short bananas = 5;
        short milkVolume = 200;
        short eggs = 4;
        short iceCreamBriquette = 2;
        int totalBananaWeight = bananas * bananaWeight;
        int totalMilkWeight = (milkVolume * milkWeight) / 100;
        int totalIceCreamWeight = iceCreamBriquette * iceCreamWeight;
        int totalEggsWeight = eggs * eggWeight;
        int totalBreakfastWeight = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println(totalBreakfastWeight);

        int weightNeedToLostKg = 7;
        int weightNeedToLostGram = weightNeedToLostKg * 1000;
        int firstDiet = 250;
        int secondDiet = 500;
        int firstDietDayNeed = weightNeedToLostGram / firstDiet;
        int secondDietDayNeed = weightNeedToLostGram / secondDiet;
        int avgDayNeed = (firstDietDayNeed + secondDietDayNeed) / 2;
        System.out.println(weightNeedToLostGram);
        System.out.println(firstDietDayNeed);
        System.out.println(secondDietDayNeed);
        System.out.println(avgDayNeed);

        int salary1 = 67760;
        int salary2 = 83690;
        int salary3 = 76230;
        double newSalary1 = salary1 * 1.1;
        double newSalary2 = salary2 * 1.1;
        double newSalary3 = salary3 * 1.1;
        double incomeDifference1 = newSalary1 - salary1;
        double incomeDifference2 = newSalary2 - salary2;
        double incomeDifference3 = newSalary3 - salary3;
        System.out.println("Маша теперь получает " + newSalary1 + " рублей. Годовой доход вырос на " + incomeDifference1 + " рублей.");
        System.out.println("Денис теперь получает " + newSalary2 + " рублей. Годовой доход вырос на " + incomeDifference2 + " рублей.");
        System.out.println("Кристина теперь получает " + newSalary3 + " рублей. Годовой доход вырос на " + incomeDifference3 + " рублей.");
    }
}