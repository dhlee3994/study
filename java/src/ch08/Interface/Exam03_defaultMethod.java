package ch08.Interface;

interface MyInterface1 {
    default void method1() {
        System.out.println("method1() in MyInterface1");
    }

    default void method2() {
        System.out.println("method2() in MyInterface1");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface1");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}

class Parent {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

class Child extends Parent implements MyInterface1, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");
    }
}

public class Exam03_defaultMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface1.staticMethod();
        MyInterface2.staticMethod();
    }
}
