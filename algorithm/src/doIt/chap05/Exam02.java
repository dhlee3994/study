package doIt.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("정수 : ");
        int y = Integer.parseInt(br.readLine());

        System.out.println(gcd(x, y));
    }
}
