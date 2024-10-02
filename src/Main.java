 class Main {
    public static void main(String[] args) {
        // 1 task
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");

        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        // 2 task
        byte temperature = 18;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // 3 task
        byte speed = 88;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // 4 task
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        // 5 task
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }

        // 6 task
        byte capacity = 102;
        byte placeToSit = 60;
        byte fullness = 70;
        if (fullness <= placeToSit) {
            System.out.println("Есть свободные сидячие места");
        } else if (fullness > placeToSit && fullness <= capacity) {
            System.out.println("Есть свободные стоячие места");
        } else if (fullness == capacity) {
            System.out.println("Мест нет");
        }

        // 7 task
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " - большее из всех чисел");
        } else if (two > one && two > three) {
            System.out.println(two + " - большее из всех чисел");
        } else if (three > one && three > two) {
            System.out.println(three + " - большее из всех чисел");
        }
    }
}