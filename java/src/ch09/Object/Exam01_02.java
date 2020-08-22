package ch09.Object;

import java.time.Period;

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }
}
public class Exam01_02 {
    public static void main(String[] args) {
        Person p1 = new Person(10L);
        Person p2 = new Person(10L);

        if (p1 == p2) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        if (p1.equals(p2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
