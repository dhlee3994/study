package doIt.chap06;

public class Exam03 {
    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void bubble(int[] a) {
        int len = a.length;
        int k = 0;
        while (k < len - 1) {
            int last = len - 1;
            for (int i = len - 1; i > k; i--) {
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                    last = i;
                }
            }
            k = last;
        }
    }
}
