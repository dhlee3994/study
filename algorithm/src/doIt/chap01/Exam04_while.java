package doIt.chap01;

import java.util.Scanner;

public class Exam04_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.print("양의 정수를 입력해주세요. > ");
            a = sc.nextInt();
        } while (a <= 0);

        int n = 0;
        int tmp = a;
        while (tmp > 0) {
            tmp /= 10;
            n++;
        }
        System.out.printf("%d는 %d자리 수 숫자입니다.", a, n);
    }
}
