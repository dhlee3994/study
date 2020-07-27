package doIt.chap05;

public class Exam06 {
    static void hanoi(int no, int from, int to) {
        int mid = 6 - from - to;

        if (no > 1)
            hanoi(no - 1, from, mid);
        System.out.printf("원반[%d]를 %d기둥에서 %d기둥으로 옮겼습니다.\n", no, from, to);

        if (no > 1)
            hanoi(no - 1, mid, to);
    }

    public static void main(String[] args) {
        hanoi(2, 1, 3);
    }
}
