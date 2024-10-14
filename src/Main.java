class Main {
    public static void main(String[] args) {
        // 1 task
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // 2 task
        String fullNameUpper1 = fullName.replace("v", "V");
        String fullNameUpper2 = fullNameUpper1.replace("a", "A");
        String fullNameUpper3 = fullNameUpper2.replace("n", "N");
        String fullNameUpper4 = fullNameUpper3.replace("o", "O");
        String fullNameUpper5 = fullNameUpper4.replace("i", "I");
        String fullNameUpper6 = fullNameUpper5.replace("c", "C");
        String fullNameUpper = fullNameUpper6.replace("h", "H");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);

        // 3 task
        String fullName2 = "Иванов Семён Семёнович";
        String changedSecondName = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + changedSecondName);
    }
}