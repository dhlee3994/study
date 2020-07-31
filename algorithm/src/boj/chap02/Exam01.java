package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) min = a[i];
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) max = a[i];
        }
        System.out.print(min + " " + max);
    }
}
