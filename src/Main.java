import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double[] fractional = {1.57, 7.654, 9.986};

        int[] game = new int[4];
        game[0] = 3;
        game[1] = 15;
        game[2] = 10;
        game[3] = 20;
    }

    public static void task2() {
        System.out.println("Task 2");
        //writing kode for task 2

        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }

        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            if (i != 2) {
                System.out.print(fractional[i] + ", ");
            } else {
                System.out.println(fractional[i]);
            }
        }


        int[] game = new int[4];
        game[0] = 3;
        game[1] = 15;
        game[2] = 10;
        game[3] = 20;

        for (int i = 0; i < game.length; i++) {
            if (i != 3) {
                System.out.print(game[i] + ", ");
            } else {
                System.out.println(game[i]);
            }
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        //writing kode for task 3

        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        for (int i = 2; i >= 0; i--) {
            if (i != 0) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }

        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i != 0) {
                System.out.print(fractional[i] + ", ");
            } else {
                System.out.println(fractional[i]);
            }
        }

        int[] game = new int[4];
        game[0] = 3;
        game[1] = 15;
        game[2] = 10;
        game[3] = 20;

        for (int i = 3; i >= 0; i--) {
            if (i != 0) {
                System.out.print(game[i] + ", ");
            } else {
                System.out.println(game[i]);
            }
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        //writing kode for task 4

        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integers));

    }
}