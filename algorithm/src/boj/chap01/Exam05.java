package boj.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if ((b - 45) < 0) {
            if ((a - 1) < 0){
                System.out.printf("%d %d", 23, (60+b-45));
            } else {
                System.out.printf("%d %d", (a-1), (60+b-45));
            }
        } else {
            System.out.printf("%d %d", a, (b-45));
        }
    }
}
