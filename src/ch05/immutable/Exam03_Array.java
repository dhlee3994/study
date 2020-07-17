package ch05.immutable;

public class Exam03_Array {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        arr[1] = "z";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
