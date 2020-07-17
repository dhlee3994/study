// 메서드 : 가변 파라미터 vs 배열 파라미터
package ch01.method;

public class Exam01_04_variable_argument {
    // 가변 파라미터
    private static void hello(String... names) {
        int length = names.length;
        System.out.println("names.length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.printf("%s님 반갑습니다.", names[i]);
        }
        System.out.println("------------------------");
    }
    // 배열 파라미터
    private static void hello2(String[] names) {
        int length = names.length;
        System.out.println("names.length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.printf("%s님 반갑습니다.", names[i]);
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        hello(arr);
        hello2(arr);

        hello("a", "b");
        //hello2("a", "b"); // 컴파일 오류
    }
}
