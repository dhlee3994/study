package ch08.Interface;

class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i);
    }
}

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {
    @Override
    public void methodB() {
        System.out.println("methodB() By I3");
    }
}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}

public class Exam02_3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }

}
