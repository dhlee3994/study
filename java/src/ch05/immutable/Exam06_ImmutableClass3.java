package ch05.immutable;

final class ImmutableClass3 {
    public final int i;

    ImmutableClass3(int i) {
        this.i = i;
    }
}

public class Exam06_ImmutableClass3 {
    public static void main(String[] args) {
        int i = 10;
        ImmutableClass3 ic = new ImmutableClass3(i);

        System.out.println(ic.i);

    }
}
