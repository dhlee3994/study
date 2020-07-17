// 메서드 : 사용 전
package ch01.method;

import java.util.Scanner;

public class Exam01_01_before {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int length = scanner.nextInt();

        int starLen = 1;
        while (starLen <= length) {
            int spaceCnt = 1;
            int spaceLen = (length - starLen) / 2;
            while (spaceCnt <= spaceLen) {
                System.out.print(" ");
                spaceCnt++;
            }

            int starCnt = 1;
            while (starCnt <= starLen) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            starLen += 2;
        }
    }
}
