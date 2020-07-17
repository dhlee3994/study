package ch06.String;

public class Exam01 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = new String("Hello").intern();

        System.out.println(str1 == str2); // "Hello" == "Hello"                                  => true
        System.out.println(str3 == str4); // new String("Hello") == new String("Hello")          => false
        System.out.println(str1 == str3); // "Hello" == new String("Hello")                      => false
        System.out.println(str1 == str5); // "Hello" == new String("Hello").intern()             => true
        System.out.println(str3 == str5); // new String("Hello") == new String("Hello").intern() => false
    }
}
