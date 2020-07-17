// 메서드 : 가변 파라미터의 단점
package ch01.method;

public class Exam01_05_variable_argument {
    //private static void m1(String... names, int a) {} // 컴파일 오류
    // => 가변 파라미터는 반드시 맨 뒤에 와야 함.
    //private static void m2(String... names, String... names2) {} // 컴파일 오류
    // => names가 앞에 선언 됨. 즉, 가변 파라미터는 반드시 맨 뒤에 선언되어야 하므로 여러 개를 선언할 수 없다.
    private static void m3(int a, int... length) {}

    // 배열 파라미터는 순서 상관이 없음.
    private static void m4(String[] names, int[] a, String[] names2) {}

    public static void main(String[] args) {}
}
