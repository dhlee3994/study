package doIt.chap03;

import java.util.Scanner;

public class Exam02_sentinel {
    static int seqSearch(int[] a, int n, int key) {
       int i = 0;
       a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+ i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("X");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
    }
}
