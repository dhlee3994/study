package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String tmp = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < m; k++) {
                    arr[i] += str.charAt(j);
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
