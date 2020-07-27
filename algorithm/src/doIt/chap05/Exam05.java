package doIt.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam05 {
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int gcdArr(int[] a, int start, int n) {
        if (n == 1)
            return a[start];
        else if (n == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArr(a, start + 1, n - 1));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = {8, 12, 16};
        System.out.println(gcdArr(a,0, a.length));
    }
}
