package ch08.Interface;

class A {
    public void methodA(I i) {
        i.methodB();
    }
}

interface I {
    void methodB();
}

class B implements I {
    public void methodB() {
        System.out.println("methodB by I");
    }
}

public class Exam02_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.methodA(b);
    }
}
