 class Main {
    public static void main(String[] args) {
        // 1 task
        for (int i = 1; i <= 10; i ++) System.out.println(i);

        // 2 task
        for (int i = 10; i > 0; i --) System.out.println(i);

        // 3 task
        for (int i = 0; i < 17; i ++) System.out.println(i);

        // 4 task
        for (int i = 10; i >= -10; i --) System.out.println(i);

        // 5 task
        for (int year = 1904; year <= 2096; year = year + 4) System.out.println(year + " год является високосным");

        // 6 task
        for (int i = 7; i <= 98; i += 7) System.out.println(i);

        // 7 task
        for (int i = 1; i <= 512; i *= 2) System.out.println(i);

        // 8 task
        int a = 29000;
        for (int i = 1; i <= 12; i ++, a += 29000) System.out.println("Месяц " + i + ", сумма накоплений равна " + a + " рублей");

        // 9 task
        double b = 29000;
        for (int i = 1; i <= 12; i ++, b *= 1.01) System.out.println("Месяц " + i + ", сумма накоплений равна " + b + " рублей");

        // 10 task
        for (int multiplier = 1; multiplier <= 10; multiplier ++) System.out.println("2 * " + multiplier + " = " + (2 * multiplier));
    }
}