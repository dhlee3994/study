package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = a[i]%42;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = i; j < 9; j++)
                if (result[i] == result[j+1]) cnt++;
            if (cnt == 0) count++;
        }
        System.out.print(count);
    }
}
