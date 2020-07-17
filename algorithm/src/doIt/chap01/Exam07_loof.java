package doIt.chap01;

import java.util.Scanner;

public class Exam07_loof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        int side;
        do {
            System.out.print("단수 : ");
            side = sc.nextInt();
        } while (side <= 0);

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
