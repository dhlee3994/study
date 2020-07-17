package doIt.chap01;

import java.util.Scanner;

public class Exam09_loof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i+1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
