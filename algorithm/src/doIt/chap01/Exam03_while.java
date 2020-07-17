package doIt.chap01;

import java.util.Scanner;

public class Exam03_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("첫 번째 숫자를 입력하세요 > ");
        a = sc.nextInt();
        while (true) {
            System.out.print("두 번째 숫자를 입력하세요 > ");
            b = sc.nextInt();
            if(b > a) break;
            System.out.println("첫 번째 숫자보다 큰 값을 입력하세요.");
        }

        System.out.printf("b - a는 %d입니다.", (b - a));
    }
}
