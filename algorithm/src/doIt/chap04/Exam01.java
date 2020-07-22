package doIt.chap04;

public class Exam01 {
    private int[] stack;
    private int max;
    private int pointer;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException() {}
    }

    public Exam01(int capacity) {
        pointer = 0;
        max = capacity;
        try {
            stack = new int[max];
        } catch (OutOfMemoryError ee) {
            max = 0;
        }
    }

    public int push(int x) throws OverFlowIntStackException {
        if (pointer >= max)
            throw new OverFlowIntStackException();

        return stack[pointer++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (pointer <= 0)
            throw new EmptyIntStackException();

        return stack[--pointer];
    }

    public int peek() throws EmptyIntStackException {
        if (pointer < 0)
            throw new EmptyIntStackException();

        return stack[pointer - 1];
    }

    public int indexOf(int x) {
        for (int i = 0; i < max; i++) {
            if (stack[i] == x)
                return stack[i];
        }
        return -1;
    }

    public void clear() {
        pointer = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= max;
    }

    public void dump() {
        if (isEmpty())
            System.out.println("비어있슈~");
        else {
            System.out.println("바닥 -> 꼭대기");
            for (int i = 0; i < pointer; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println("\n----------------------");
            System.out.println("꼭대기 -> 바닥");
            for (int i = (pointer - 1); i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exam01 stack = new Exam01(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.dump();
    }
}
