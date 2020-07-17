package doIt.chap01;

import java.util.Scanner;

public class Exam02_loof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >");
        int target = sc.nextInt();
        Exam01(target);
        System.out.println(Exam02(target));
        System.out.println(Exam03(2,6));
    }

    static void Exam01(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i < n){
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            sum += i;
        }
        System.out.println(" = " + sum);
    }

    static int Exam02(int n) {
        return  (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
    }

    static int Exam03(int a, int b) {
        int min, max;
        int result = 0;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for (int i = min; i <= max ; i++) {
            result += i;
        }

        return result;
    }
}
