package doIt.chap04;

import javax.management.relation.RoleUnresolved;

public class Exam02<E> {
    private E[] stack;
    private int max;
    private int pointer;

    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    public static class OverFlowStackException extends RuntimeException {
        public OverFlowStackException() {}
    }


    public Exam02(int capacity) {
        max = capacity;
        try {
            stack = (E[]) new Object[max];
        } catch (OutOfMemoryError) {
            max = 0;
        }
    }
}
