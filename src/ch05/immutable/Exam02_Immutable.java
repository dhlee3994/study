package ch05.immutable;

public class Exam02_Immutable {
    public static void main(String[] args) {
        String str1 = new String("Hi");
        String str2 = "Hi";

        str1 += "a";
        str2 += "a";
        System.out.println(str1);
        System.out.println(str2);
    }
}
