package boj.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);
        if (a < 10) str = "0" + a;
        int result = 0;
        int temp = 0;
        String[] strArr;
        while (true) {
            result++;
            strArr = str.split("");
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[1]);
            temp = x + y;
            if (temp >= 10) {
                str = (Integer.toString(y) + Integer.toString((temp % 10)));
            } else {
                str = Integer.toString(y) + Integer.toString(temp);
            }
            if (Integer.parseInt(str) == a) break;
        }
        System.out.println(result);
    }
}
