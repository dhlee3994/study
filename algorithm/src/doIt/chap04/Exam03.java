package doIt.chap04;

import java.util.PrimitiveIterator;

public class Exam03 {
    private int max;
    private int pointerA;
    private int pointerB
    private int[] stack;

    public class EmptyException() extends RuntimeException{
    
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

    public int push()
}
