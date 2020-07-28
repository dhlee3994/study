package boj.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (90 <= a) {
            System.out.print("A");
        } else if (80 <= a) {
            System.out.print("B");
        } else if (70 <= a) {
            System.out.print("C");
        } else if (60 <= a) {
            System.out.print("D");
        } else if (0 <= a) {
            System.out.print("F");
        }
    }
}
