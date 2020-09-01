package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int f = 0;
        int t = 0;
        while (true) {
            if (N % 5 == 0) {
                f = N / 5;
                System.out.println(f + t);
                break;
            } else if (N <= 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            t++;
        }
    }
}
