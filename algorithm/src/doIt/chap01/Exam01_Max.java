package doIt.chap01;

import java.util.function.IntToDoubleFunction;

public class Exam01_Max {
    public static void main(String[] args) {
        System.out.println(max4(10,2,-5,100));
        System.out.println(min3(-1, -100, 5));
        System.out.println(min4(-2,-5,1,0));
    }

    static int max4(int a, int b, int c, int d) {
        int max;

        max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min;

        min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }
    static int min4(int a, int b, int c, int d) {
        int min;

        min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }


}
