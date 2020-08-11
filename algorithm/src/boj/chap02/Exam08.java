package boj.chap02;

public class Exam08 {
    public static void main(String[] args) {
        int n = 10;
        int[] criterion = new int[n];
        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            criterion[i] = i+1;
            arr[i] = d(i+1);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > 10) continue;
            int cnt = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == criterion[j]) cnt++;

            if (cnt == 0) result[i] = i;
        }

        for (int a : result)
            System.out.println(a);
    }
    private static int d(int n) {
        String[] str = Integer.toString(n).split("");
        int len = str.length;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(str[i]);

        for (int i = 0; i < len; i++)
            n += arr[i];

        return n;
    }
}
