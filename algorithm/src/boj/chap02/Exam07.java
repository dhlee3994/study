package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];
            int sum = 0;
            int avg = 0;
            for (int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(st.nextToken());;
                sum += arr[j];
            }
            avg = sum/m;
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (avg < arr[j]) count++;
            }
            result[i] = (double)count/m*100;
        }
        for (double a : result) {
            System.out.printf("%.3f%%\n", a);
        }
    }
}
