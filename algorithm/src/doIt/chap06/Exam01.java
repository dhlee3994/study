package doIt.chap06;

public class Exam01 {
    static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
    static void bubble(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (a[j - 1] > a[j])
                    swap(a, j-1, j);
            }
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
