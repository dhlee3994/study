package boj.chap01;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[i] = a+b;
        }

        for (int i = 0; i < len; i++) {
            System.out.println(result[i]);
        }
    }
}
