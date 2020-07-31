package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int max = a[0];
        int cursor = 0;
        for (int i = 1; i < 9; i++) {
            if (max < a[i]) {
                max = a[i];
                cursor = i;
            }
        }
        System.out.println(max);
        System.out.print(cursor + 1);
    }
}
