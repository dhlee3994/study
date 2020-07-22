package doIt.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요소수  : ");
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];
        int[] idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("key : ");
        int key = Integer.parseInt(br.readLine());

        int result = searchIdx(a, num, key, idx);
        System.out.println("key 갯수 : " + result);
        for (int i = 0; i < result; i++) {
            System.out.printf("%d는 a[%d]에 있습니다.\n",result, idx[i]);
        }
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                // idx[result] = i; result++;
                idx[result++] = i;
            }
        }
        return result;
    }
}
