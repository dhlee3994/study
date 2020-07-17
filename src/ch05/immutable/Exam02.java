package ch05.immutable;

class Person2 {
    private String name;
    private int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Exam02 {
    public static void main(String[] args) {
        Person2 p2 = new Person2("dhlee", 27);
        System.out.println(p2);
    }
}
