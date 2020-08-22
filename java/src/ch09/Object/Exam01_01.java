package ch09.Object;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
public class Exam01_01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

    }
}
