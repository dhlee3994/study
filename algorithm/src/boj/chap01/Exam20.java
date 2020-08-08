package boj.chap01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam20 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = 0;
        int[] kim = new int[n];

        for (int i = 0; i < n; i++) {
            kim[i] = Integer.parseInt(st.nextToken());
        }

        int m = 0;
        int[] lee = new int[m];
        for (int i = 0; i < m; i++) {
            lee[i] = Integer.parseInt(st.nextToken());
        }

        for (int a : kim)
            System.out.print(a + " ");

        for (int b : lee)
            System.out.print(b + " ");
    }
}
//System.out.print((arr[i + 1]) + " ");