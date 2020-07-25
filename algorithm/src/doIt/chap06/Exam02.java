package doIt.chap06;

public class Exam02 {
    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void bubble(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int change = 0;
            for (int j = len - 1; j > i ; j--) {
                if (a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    change++;
                }
            }
            if (change == 0) break;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,6,8,6,3,10};
        bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
