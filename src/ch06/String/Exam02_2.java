package ch06.String;

public class Exam02_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.printf("sb : value = %-30s, address = %s, capacity = %s\n", sb, sb.hashCode(), sb.capacity());
        sb.append("Hello");
        System.out.printf("sb : value = %-30s, address = %s, capacity = %s\n", sb, sb.hashCode(), sb.capacity());
        sb.append(", ");
        System.out.printf("sb : value = %-30s, address = %s, capacity = %s\n", sb, sb.hashCode(), sb.capacity());
        sb.append("World! ");
        System.out.printf("sb : value = %-30s, address = %s, capacity = %s\n", sb, sb.hashCode(), sb.capacity());
        sb.append("Have a nice day!");
        System.out.printf("sb : value = %-30s, address = %s, capacity = %s\n", sb, sb.hashCode(), sb.capacity());

    }
}
