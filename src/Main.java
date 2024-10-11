class Main {
    public static void main(String[] args) {
        // 1 task
        int[] spending = new int[]{10000, 9000, 40000, 5000, 7000};
        int spendingSum = 0;
        for (int j : spending) {
            spendingSum += j;
        }
        System.out.println("Сумма трат за месяц составила " + spendingSum + " рублей");

        // 2 task
        int[] spending2 = new int[]{10000, 9000, 40000, 5000, 7000};
        int maxSpending = 0;
        int minSpending = spending2[0];
        for (final int current : spending2) {
            if (current > maxSpending) {
                maxSpending = current;
            }
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. Максимальная сумма трат за неделю составила " + maxSpending + " рублей");

        // 3 task
        int[] spending3 = new int[]{10001, 9000, 40000, 5000, 7000};
        double spendingSum2 = 0;
        for (int j : spending3) {
            spendingSum2 += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + spendingSum2 / spending3.length + " рублей");

        // 4 task
        char[] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseName.length - 1; i >= 0; i--) {
            System.out.print(reverseName[i]);
        }
    }
}