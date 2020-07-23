package doIt.chap04;

import javax.management.relation.RoleUnresolved;

public class Exam03 {
    private int max;
    private int pointerA;
    private int pointerB;
    private int[] stack;

    public enum AB {
        StackA, StackB;
    }


    static class EmptyException extends RuntimeException {
        public EmptyException() {
        }
    }

    static class OverFlowException extends RuntimeException {
        public OverFlowException() {
        }
    }


    public Exam03(int capacity) {
        pointerB = max - 1;
        pointerA = 0;
        max = capacity;
        try {
            stack = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(AB ab, int x) throws OverFlowException {
        if (pointerA >= pointerB + 1)
            throw new OverFlowException();

        switch (ab) {
            case StackA:
               stack[pointerA++] = x; break;
            case StackB:
               stack[pointerB--] = x; break;
        }
        return x;
    }

    public int pop(AB ab) throws EmptyException {
        int result = 0;
        switch (ab) {
            case StackA:
                if (pointerA <= 0)
                    throw new EmptyException();
                result = stack[--pointerA];
                break;
            case StackB:
                if (pointerB >= max -1)
                    throw new EmptyException();
                result = stack[++pointerB];
                break;
        }
        return result;
    }
}
