package ch08.Interface;

class A1 {
    public void methodA1(B1 b) {
        // b.methodB(); 에러
    }
}

class B1 {
    /*
    public void methodB() {
        System.out.println("methodB()");
    }
    */

    public void methodB1(int n) {
        System.out.println("methodB1() : " + n);
    }
}

public class Exam02_1 {
    public static void main(String[] args) {
        A1 a = new A1();
        // a.methodA(new B1()); 에러
    }
}
