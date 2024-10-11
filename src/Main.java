class Main {
    public static void main(String[] args) {
        // 1 and 2 task
        int [] integer = new int []{1, 2, 3};
        double [] double1 = new double []{1.57, 7.654, 9.986};
        short [] short1 = new short []{4, 5, 6};

        for (int j : integer) {
            System.out.print(j + ", ");
        }
        for (double v : double1) {
            System.out.print(v + ", ");
        }
        for (int i = 0; i < short1.length; i++) {
            if (i + 1 != short1.length) {
                System.out.print(short1[i] + ", ");
            } else {
                System.out.println(short1[i]);
            }
        }

        // 3 task
        for (int i = short1.length - 1; i >= 0; i--) {
            System.out.print(short1[i] + ", ");
        }
        for (int i = double1.length - 1; i >= 0; i--) {
            System.out.print(double1[i] + ", ");
        }
        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.print(integer[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 4 task
        for (int j : integer) {
            if (j % 2 != 0) {
                System.out.print((j + 1));
            } else {
                System.out.print(j);
            }
        }
    }
}