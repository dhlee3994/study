package doIt.chap01;

import java.util.Scanner;

public class Exam08_loof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side;

        do {
            System.out.println("단 수 : ");
            side = sc.nextInt();
        } while (side <= 0);

        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
