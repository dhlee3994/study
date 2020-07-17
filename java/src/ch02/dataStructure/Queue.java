package ch02.dataStructure;

public class Queue extends LinkedList {
    public void offer(Object value) {
        this.add(value);
    }

    public Object pull() {
        return this.remove(0);
    }
}
