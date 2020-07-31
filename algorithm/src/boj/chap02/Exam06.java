package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            String s = str[i];
            String[] result = s.split("");
            int sum = 0;
            int count = 0;
            for (int j = 0; j < result.length; j++) {
                if (result[j].equals("O")) {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                    sum += count;
                }
            }
            System.out.println(sum);
        }
    }
}
