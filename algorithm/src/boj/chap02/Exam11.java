package boj.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ( arr[c - 'a'] == - 1)
                arr[c - 'a'] = i;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
