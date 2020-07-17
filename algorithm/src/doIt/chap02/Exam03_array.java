package doIt.chap02;

public class Exam03_array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20, 30, 40, 50};
        copy(a, b);
        print(a);

        int[] c = {1, 2, 3, 4};
        int[] d = {10, 20};
        copy(c, d);
        print(c);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void copy(int[] a, int[] b) {
        int length = (a.length >= b.length) ? b.length : a.length;
        for (int i = 0; i < length; i++) {
            a[i] = b[i];
        }
    }
}
