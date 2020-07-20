package doIt.chap03;

import java.util.Scanner;

public class Exam03_binary {
    static int binSearcy(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.print("x[] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] :");
                x[i] = sc.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = binSearcy(x, num, key);

        if (idx == -1)
            System.out.println("X");
        else
            System.out.println(idx);
    }
}
