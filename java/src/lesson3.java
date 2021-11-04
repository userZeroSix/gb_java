import java.util.Arrays;

public class lesson3 {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5(7, 5);
        }


        public static void task1() {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else arr[i] = 0;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }

        public static void task2() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");

            }
            System.out.println("");
            System.out.println("");
        }

        public static void task3() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }

        public static void task4() {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                System.out.println();
            }
        }

        public static void task5(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }

    }

