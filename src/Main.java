class Main {
    public static void main(String[] args) {
        // 1 task
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2 task
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 3 task
        for (int i = 0; i < 17; i++) {
            System.out.println(i);
        }

        // 4 task
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // 5 task
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // 6 task
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        // 7 task
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        // 8 task
        int savings1 = 29000;
        for (int i = 1; i <= 12; i++, savings1 += 29000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings1 + " рублей");
        }

        // 9 task
        double savings2 = 29000;
        for (int i = 1; i <= 12; i++, savings2 *= 1.01) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings2 + " рублей");
        }

        // 10 task
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println("2 * " + multiplier + " = " + (2 * multiplier));
        }


        // 1 task
        int savings = 0;
        int months = 0;
        while (savings < 2_459_000) {
            savings += 15_000;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + savings + " рублей");
        }

        //2 task
        int firstTen = 0;
        int secondTen = 11;

        while (firstTen < 10) {
            firstTen++;
            System.out.print(firstTen + " ");
        }
        System.out.println("");
        while (secondTen > 1) {
            secondTen--;
            System.out.print(secondTen + " ");
        }
        System.out.println("");

        // 3 task
        int populationOfTheCityY = 12_000_000;
        int birthRate = (populationOfTheCityY / 1000) * 17;
        int diesRate = (populationOfTheCityY / 1000) * 8;
        int year = 2015;
        int newPopulation = populationOfTheCityY;

        while (year < 2025) {
            year++;
            newPopulation = newPopulation + (birthRate - diesRate);
            System.out.println("Год " + year + ", численность населения составляет " + newPopulation);
        }

        // 4 task
        double contribution1 = 15_000;
        int monthsNeed1 = 0;

        while (contribution1 < 12_000_000) {
            contribution1 *= 1.07;
            monthsNeed1++;
            System.out.println("Месяц " + monthsNeed1 + ", сумма накоплений равна " + contribution1 + " рублей");
        }

        // 5 task
        double contribution2 = 15_000;
        int monthsNeed2 = 0;

        while (contribution2 < 12_000_000) {
            contribution2 *= 1.07;
            monthsNeed2++;
            if (monthsNeed2 % 6 == 0) {
                System.out.println("Месяц " + monthsNeed2 + ", сумма накоплений равна " + contribution2 + " рублей");
            }
        }

        // 6 task
        double contribution3 = 15_000;
        int monthsNeed3 = 0;

        while (monthsNeed3 < 9 * 12) {
            contribution3 *= 1.07;
            monthsNeed3++;
            if (monthsNeed3 % 6 == 0) {
                System.out.println("Месяц " + monthsNeed3 + ", сумма накоплений равна " + contribution3 + " рублей");
            }
        }

        // 7 task
        int friday = 4;

        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        // 8 task
        int twoHundredYearsAgo = year - 200;
        int yearsPast = 0;

        while (yearsPast < year) {
            if (yearsPast > twoHundredYearsAgo) {
                System.out.println(yearsPast);
            }
            yearsPast += 79;
        }

    }
}