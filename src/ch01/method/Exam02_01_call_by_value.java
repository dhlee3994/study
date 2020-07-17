// 메서드 : Call by value
package ch01.method;

public class Exam02_01_call_by_value {
    private static void swap(int a, int b) {
        System.out.printf("before : a = %d, b = %d \r\n", a, b);
        int tmp = a;
        a = b;
        b = a;
        System.out.printf("after : a = %d, b = %d \r\n", a, b);
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        swap(a, b);
        System.out.printf("main : a = %d, b = %d \r\n", a, b);
    }
}
// Call by value

