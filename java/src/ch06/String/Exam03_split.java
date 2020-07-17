package ch06.String;

public class Exam03_split {
    public static void main(String[] args) {
        String str = "dhlee.dev";
        String[] arr = str.split(".");

        System.out.println("split 시작");
        for (String s : arr) {
            System.out.printf("[%s]\n", s);
        }
        System.out.println();
        System.out.println("split 종료");

        String[] arr2 = str.split("\\.");
        System.out.println("split 시작");
        for (String s : arr2) {
            System.out.printf("[%s]\t", s);
        }
        System.out.println();
        System.out.println("split 종료");

        String[] arr3 = str.split("[.]");
        System.out.println("split 시작");
        for (String s : arr3) {
            System.out.printf("[%s]\t", s);
        }
        System.out.println();
        System.out.println("split 종료");
    }
}
