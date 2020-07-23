package doIt.chap04;

public class Exam04 {
    private int max;
    private int pointer;
    private int[] queue;

    static class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {
        }
    }

    static class OverFlowQueueException extends RuntimeException {
        public OverFlowQueueException() {
        }
    }

    public Exam04(int max) throws OutOfMemoryError {
        this.max = max;

        try {
            queue = new int[this.max];
        } catch (OutOfMemoryError error) {
            this.max = 0;
        }
    }

    public int enQue(int x) {
        if (pointer >= max)
            throw new OverFlowQueueException();

        return queue[pointer++] = x;
    }

    public int deQUe() {
        if (pointer <= 0)
            throw new EmptyQueueException();

        int result = queue[0];

        for (int i = 0; i <= max - 1 ; i++)
            queue[i] = queue[i + 1];

        pointer--;

        return result;
    }

    public int indexOf(int x) {
        for (int i = 0; i < max - 1; i++) {
            if (queue[i] == x)
                return i;
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
        return (pointer <= 0);
    }

    public boolean isFull() {
        return (pointer >= max);
    }

    public void dump() {
        if (pointer <= 0) {
            throw new EmptyQueueException();
        } else {
            for (int i = 0; i < max - 1; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
            for (int i = max - 1; i >= 0 ; i--) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
