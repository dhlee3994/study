package doIt.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {
    static int factorial(int x) {
        return (x > 0) ? x * factorial(x - 1) : 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("값 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println(factorial(x));
    }
}
