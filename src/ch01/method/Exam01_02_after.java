// 메서드 : 사용 후
package ch01.method;

import java.util.Scanner;

public class Exam01_02_after {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int length = scanner.nextInt();

        for (int starLen = 1; starLen <= length ; starLen +=2 ) {
            printSpace(getSpaceLength(length, starLen));
            printStars(starLen);
            System.out.println();
        }
    }

    private static void printSpace(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }

    private static int getSpaceLength(int length, int starLen) {
        return (length - starLen) / 2;
    }

    private static void printStars(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
    }
}
