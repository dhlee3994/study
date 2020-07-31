package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int m = a*b*c;
        int[] arr = new int[10];

        while (m != 0) {
            switch (m % 10) {
                case 0: arr[0]++; break;
                case 1: arr[1]++; break;
                case 2: arr[2]++; break;
                case 3: arr[3]++; break;
                case 4: arr[4]++; break;
                case 5: arr[5]++; break;
                case 6: arr[6]++; break;
                case 7: arr[7]++; break;
                case 8: arr[8]++; break;
                case 9: arr[9]++; break;
            }
            m /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
