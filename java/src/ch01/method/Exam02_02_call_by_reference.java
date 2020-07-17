// 메서드 : Call by reference
package ch01.method;

public class Exam02_02_call_by_reference {
    private static void swap(int[] arr) {
        System.out.printf("before : arr[0] = %d, arr[1] = %d \r\n", arr[0], arr[1]);
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        System.out.printf("after : arr[0] = %d, arr[1] = %d \r\n", arr[0], arr[1]);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{100, 200};
        swap(arr);
        System.out.printf("after : arr[0] = %d, arr[1] = %d \r\n", arr[0], arr[1]);
    }
}
// 자바의 메서드 인자 전달방식은 call by value 이다.
// 그럼 왜 이렇게 헷갈리게 하는가?
// 짱나네..