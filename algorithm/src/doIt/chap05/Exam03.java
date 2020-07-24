package doIt.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
    static int factorial(int x) {
        int result = 1;
        if (x <= 0) {
        } else {
            for (int i = x; i >= 1; i--) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("값 : ");
        int x = Integer.parseInt(br.readLine());

        System.out.println(factorial(x));
    }
}
