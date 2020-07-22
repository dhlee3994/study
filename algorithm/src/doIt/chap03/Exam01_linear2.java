package doIt.chap03;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Exam01_linear2 {
    static int linear(int[] a, int n, int key) {
        int i = 0;


        for (i = 0; i < n; i++) {
            System.out.print("  |");

            for (int j = 0; j <= i; j++)
                System.out.print(" ");

            System.out.printf("%s\n", "*");

            System.out.print(i + " |");
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d", a[j]);
            }
            System.out.println();


            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        System.out.print("  |" );
        for (int i = 0; i < num; i++) {
            System.out.printf("%2d", i);
        }
        System.out.print("\n--+--------------------\n");

        int idx = linear(x, num, key);

        System.out.println();

        if (idx == -1)
            System.out.println("없습니다.");
        else
            System.out.println(key + "는 x[" + idx + "]에 있습니다.");
    }
}
