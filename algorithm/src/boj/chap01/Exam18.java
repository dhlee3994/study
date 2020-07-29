package boj.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int o = 0, e = 0;
        if (n == 1) {
            System.out.print("*");
        } else {
            if (n % 2 == 0) {
                o = n / 2;
                e = n / 2;
            } else {
                o = ceil(n / 2.0);
                e = flo(n / 2.0);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < o; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                for (int j = 0; j < e; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
    private static int flo(double a) {
        return (int) (a - 0.5);
    }

    private static int ceil(double a) {
        return (int) (a + 0.5);
    }
}
