package doIt.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exam06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요솟수 : ");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("a[0] : ");
        a[0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("a[" + i + "] : ");
                a[i] = Integer.parseInt(br.readLine());
            } while(a[i-1] > a[i]);
        }

        System.out.print("찾을 값 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = Arrays.binarySearch(a, key);

        if (idx < 0) {
            System.out.println("없슈~");
            System.out.printf("적절한 자리는 a[%d]여유~", (-idx-1));
        }

        else
            System.out.printf("%d는 a[%d]에 있슈~", key, idx);
    }
}
