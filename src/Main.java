 class Main {
    public static void main(String[] args) {

        int pyaterka = 55555;
        byte minecraft = 16;
        short mista = 4444;
        long sleepers = 999999999999999999L;
        float pi = 3.14f;
        double pi2 = 3.1415926535897932384626433832795028841971;
        System.out.println("Значение переменной pyaterka c типом int равно " + pyaterka);
        System.out.println("Значение переменной minecraft c типом int равно " + minecraft);
        System.out.println("Значение переменной mista c типом int равно " + mista);
        System.out.println("Значение переменной sleepers c типом int равно " + sleepers);
        System.out.println("Значение переменной pi c типом int равно " + pi);
        System.out.println("Значение переменной pi2 c типом int равно " + pi2);

        float numb = 27.12f;
        long druid = 987678965549L;
        double a = 2.786;
        short b = 569;
        short minus = -159;
        short plus = 27897;
        byte c = 67;

        short LudmilaPavlovnasClass = 23;
        short AnnaSergeevnasClass = 27;
        short EkaterinaAndreevna = 30;
        short totalPaper = 480;
        int totalStudents = LudmilaPavlovnasClass + AnnaSergeevnasClass + EkaterinaAndreevna;
        int paperForOneStudent = totalPaper / totalStudents;
        System.out.println(paperForOneStudent);

        short bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;
        int bottlesPerTwentyMinutes = bottlesPerTwoMinutes * 20;
        int bottlesPerDay = bottlesPerMinute * 1440;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerThreeDays * 10;
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
        int totalBreakfastWeightGram = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println(totalBreakfastWeightGram);
        float totalBreakfastWeightKg = totalBreakfastWeightGram / 1000f;
        System.out.println(totalBreakfastWeightKg);

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

        double currentSalaryMasha = 67760;
        double currentSalaryDenis = 83690;
        double currentSalaryKristina = 76230;
        double increasePercentage = 0.10;
        double newSalaryMasha = currentSalaryMasha * (1 + increasePercentage);
        double newSalaryDenis = currentSalaryDenis * (1 + increasePercentage);
        double newSalaryKristina = currentSalaryKristina * (1 + increasePercentage);
        double yearlyDifferenceMasha = (newSalaryMasha - currentSalaryMasha) * 12;
        double yearlyDifferenceDenis = (newSalaryDenis - currentSalaryDenis) * 12;
        double yearlyDifferenceKristina = (newSalaryKristina - currentSalaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearlyDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearlyDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearlyDifferenceKristina + " рублей.");
    }
}