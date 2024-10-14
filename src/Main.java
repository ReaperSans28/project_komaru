class Main {
    public static void main(String[] args) {
        // 1 task
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // 2 task
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);

        // 3 task
        String fullName2 = "Иванов Семён Семёнович";
        String changedSecondName = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + changedSecondName);
    }
}