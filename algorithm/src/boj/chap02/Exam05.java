package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] bs = new int[n];
        double[] as = new double[n];

        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            bs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(bs);
        double M = (double)bs[n-1];

        for (int i = 0; i < n; i++) {
            as[i] = bs[i] / M * 100;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += as[i];
        }
        System.out.print(sum/n);
    }
}
