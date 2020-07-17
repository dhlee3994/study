// 메서드 : 가변 파라미터
package ch01.method;

public class Exam01_03_variable_argument {
    /*
     * 가변 파라미터 : 0개 이상의 값을 받을 때 선언하는 방식
     *  => 내부적으로 배열처럼 사용
     */
    private static void hello(String... names) {
        int length = names.length;
        System.out.println("names.length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.printf("%s님 반갑습니다.\r\n", names[i]);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        hello(); // names.length = 0;
        hello("a","b");

        String[] arr = {"a", "b", "c", "d"};
        hello(arr);
    }
}
